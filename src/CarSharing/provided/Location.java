package CarSharing.provided;

/**
 * A geo location in the car sharing system.<br>
 * 
 * A geo location is represented by two coordinates.
 * 
 * @ProgrammingProblem.Hint provided
 * 
 */
public class Location {

	/**
	 * The two coordinates representing this geo location.
	 */
	private final double n, e;

	/**
	 * An optional description of the location, like a landmark or an address.
	 */
	private String description;

	/**
	 * Creates a geo location with specified coordinates.
	 * 
	 * @param n
	 *            latitude
	 * @param e
	 *            longitude
	 */
	public Location(double n, double e) {
		this.n = n;
		this.e = e;
	}

	/**
	 * Creates a geo location with specified coordinates and a description.
	 * 
	 * @param n
	 *            latitude
	 * @param e
	 *            longitude
	 * @param description
	 *            the description if this geo location
	 */
	public Location(double n, double e, String description) {
		this(n, e);
		this.description = description;
	}

	/**
	 * Copies a geo location.
	 * 
	 * @param orig
	 *            the geo location to be copied
	 */
	public Location(Location orig) {
		this.n = orig.n;
		this.e = orig.e;
	}

	@Override
	public String toString() {

		if (description != null)

			return "Location{" + "n=" + n + ", e=" + e + ", description='" + description + '\'' + '}';

		return "Location{" + "n=" + n + ", e=" + e + '}';
	}
}