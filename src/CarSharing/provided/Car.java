package CarSharing.provided;

/**
 * A car in the car sharing system.<br>
 * 
 * Skeleton implementation, only the most basic attributes are included.
 * 
 *
 */
public class Car {
	/**
	 * The make of the car, e.g. "Toyota" or "Volkswagen".
	 */
	private String make;

	/**
	 * The model of the car, e.g. "Prius", "Golf"
	 */

	private String model;

	/**
	 * The registration, a.k.a. the code on the license plate.
	 */
	private String registration;

	/**
	 * Standard constructor creates an empty car instance.
	 */
	public Car() {

	}

	/**
	 * Creates a copy of a car
	 * 
	 * @param car
	 *            the car to be copied.
	 */
	public Car(Car car) {
		this.make = car.make;
		this.model = car.model;
		this.registration = car.registration;
	}

	/**
	 * Constructs a car with specific make, model and registration.<br>
	 * 
	 * 
	 * @param make
	 *            the make of this car
	 * @param model
	 *            the model of this car
	 * @param registration
	 *            the registration of this car
	 */
	public Car(String make, String model, String registration) {
		this.make = make;
		this.model = model;
		this.registration = registration;
	}

	/**
	 * Sets the make of this car.
	 * 
	 * 
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Sets the model of this car.
	 * 
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * Sets the registration of this car.
	 * 
	 * @param registration
	 *            the registration to set
	 */
	public void setRegistration(String registration) {
		this.registration = registration;
	}

	/**
	 * Creates a textual description of this car.<br>
	 * 
	 * Includes all attributes.
	 * 
	 * @ProgrammingProblem.Hint generate using your IDE
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", registration='" + registration + '\''
				+ '}';
	}

}
