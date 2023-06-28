package CarSharing.entities;

import CarSharing.provided.Car;
import CarSharing.provided.Customer;
import CarSharing.provided.DateTime;
import CarSharing.provided.Location;
import CarSharing.provided.TripStatus;

import java.util.Date;

/**
 * A trip in the car sharing system.<br>
 * 
 * A trip collects information about time, location, customer and car involved.
 * It also contains a rate responsible for calculation of the total amount charged for
 * a trip.
 * 
 * Some operations' behavior depends on this trip's
 * {@link CarSharing.provided.TripStatus}.
 * 
 */
public class Trip implements Comparable<Trip> {

	private Car car;
	private double distance;
	private Location endLocation;
	private DateTime endTime;
	private Rate rate;
	private Customer renter;
	private Location startLocation;
	private DateTime startTime;
	private TripStatus status = TripStatus.CREATED;

	public Trip (Car car, Customer customer, Rate rate) {
		try {
			this.car = car;
			this.renter = customer;
			this.rate = rate;
		} catch (IllegalArgumentException e) {
			System.out.println("This argument is illegal!");
		}
	}

	public Trip (Car car, Customer customer, Rate rate, Location startLocation, DateTime startTime) {
		try {
			this.car = car;
			this.renter = customer;
			this.rate = rate;
			this.startLocation = startLocation;
			this.startTime = startTime;
			this.status = TripStatus.STARTED;
		} catch (IllegalArgumentException e) {
			System.out.println("This argument is illegal!");
		}
	}

	public Trip (Car car, Customer customer, Rate rate, Location startLocation, DateTime startTime, Location endLocation, DateTime endTime, double distance) {
		try {
			this.car = car;
			this.renter = customer;
			this.rate = rate;
			this.startLocation = startLocation;
			this.startTime = startTime;
			this.endLocation = endLocation;
			this.endTime = endTime;
			this.distance = distance;
			this.status = TripStatus.COMPLETED;
		} catch (IllegalArgumentException e) {
			System.out.println("This argument is illegal!");
		}
	}

	public Trip(Trip tr) {
		this.car = tr.car; // Perform a deep copy of the car object
		this.distance = tr.distance;
		this.endLocation = tr.endLocation; // Perform a deep copy of the endLocation object
		this.endTime = tr.endTime; // Perform a deep copy of the endTime object
		this.renter = tr.renter; // Perform a deep copy of the renter object
		this.startLocation = tr.startLocation; // Perform a deep copy of the startLocation object
		this.startTime = tr.startTime; // Perform a deep copy of the startTime object
		this.status = tr.status;
	}

	public int compareTo(Trip trip) {
		if (this.status == TripStatus.STARTED && trip.status == TripStatus.CREATED)
			return Integer.MAX_VALUE;
		else
			return this.getStartTime().compareTo(trip.startTime);
	}

	public Trip end(Location endLocation, DateTime endTime, double distance) {
		if (this.status == TripStatus.STARTED) {
			if (endTime != null && endLocation != null && distance > 0){
				this.endTime = endTime;
				this.endLocation = endLocation;
				this.distance = distance;
				this.status = TripStatus.COMPLETED;
			} else throw new IllegalArgumentException();
		} else throw new IllegalStateException();

		return this;
	}

	public Trip start(Location startLocation, DateTime startTime) {
		if (this.status != TripStatus.COMPLETED && this.status != TripStatus.STARTED) {
			if (startLocation != null && startTime != null){
				this.startLocation = startLocation;
				this.startTime = startTime;
				this.status = TripStatus.STARTED;
			} else throw new IllegalArgumentException();
		} else throw new IllegalStateException();

		return this;
	}

	@Override
	public String toString() {
		return "Trip{" +
				"car=" + car +
				", distance=" + distance +
				", endLocation=" + endLocation +
				", endTime=" + endTime +
				", rate=" + rate +
				", renter=" + renter +
				", startLocation=" + startLocation +
				", startTime=" + startTime +
				", status=" + status +
				'}';
	}

	public final int total (){
		return rate.total(this);
	}


	/**
	 * The duration of this trip in seconds.<br>
	 *
	 *
	 *
	 * @ProgrammingProblem.Hint use {@link DateTime#diff(DateTime)}
	 * @return the difference in seconds if this trip is completed, zero otherwise
	 */
	public int duration() {
		if (status == TripStatus.COMPLETED)
			return (int) (startTime.diff(endTime));

		return 0;
	}

	public double getDistance() {
		return distance;
	}

	public Location getEndLocation() {
		return endLocation;
	}

	public DateTime getEndTime() {
		return endTime;
	}

	public Rate getRate() {
		return rate;
	}

	public Location getStartLocation() {
		return startLocation;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public TripStatus getStatus() {
		return status;
	}
}
