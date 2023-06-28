package CarSharing.provided;

/**
 * A matcher base class.
 * 
 * implementing classes match objects to some pattern.
 * 
 * 
 * @ProgrammingProblem.Hint provided
 * 
 * @param <T>
 *            the type of the object to match
 */
public abstract class Matcher<T> {

	/**
	 * Constructs a matcher with a specific pattern.
	 * 
	 * @param pattern
	 *            the pattern of this matcher
	 */
	public Matcher(String pattern) {

	}

	/**
	 * Constructs a default matcher.
	 */
	public Matcher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Matches an object against the pattern of this matcher.<br>
	 * 
	 * @param t
	 *            the object to match
	 * @return whether t matches the pattern of this matcher.
	 */
	public abstract boolean matches(T t);

}
