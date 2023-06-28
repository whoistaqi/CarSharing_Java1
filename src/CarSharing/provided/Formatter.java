package CarSharing.provided;

/**
 * Represents the concept of creating a formatted text for an instacne of some
 * class T.
 * 
 * 
 * 
 * 
 * @ProgrammingProblem.Hint provided
 * @param <T>
 */
public abstract class Formatter<T> {

	/**
	 * 
	 * Creates a string representation of an object in the format represented by
	 * this formatter.
	 * 
	 * @param t
	 *            the object for which a string representation shall be created
	 * @return the string representation of object t
	 */
	public abstract String format(T t);
}
