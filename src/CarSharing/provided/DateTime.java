package CarSharing.provided;

/**
 * 
 * A point in time represented with human readable coordinates year, month, day,
 * hour, minutes.<br>
 * 
 * 
 * 
 * @ProgrammingProblem.Hint provided 
 */
public class DateTime implements Comparable<DateTime> {

	int day, month, year, hr, min;

	/**
	 * Constructor.
	 * 
	 * @param year
	 *            the year
	 * @param month
	 *            the month
	 * @param day
	 *            the day
	 * @param hr
	 *            the hours
	 * @param min
	 *            the minutes
	 */
	public DateTime(int year, int month, int day, int hr, int min) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.hr = hr;
		this.min = min;
	}

	/**
	 * copy constructor.
	 * 
	 * @param orig
	 *            DateTime object to copy
	 */
	public DateTime(DateTime orig) {
		this.day = orig.day;
		this.month = orig.month;
		this.year = orig.year;
		this.hr = orig.hr;
		this.min = orig.min;

	}

	@Override
	public String toString() {
		return String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hr, min);
	}

	@Override
	public int compareTo(DateTime o) {
		if (o == null)
			return Integer.MIN_VALUE;

		return Long.compare(ts(), o.ts());
	}

	/**
	 * Time stamp as a long value ready for numeric comparison.<br>
	 * 
	 * example: 2004-11-21 23:17 becomes 200411212317
	 * 
	 * @return
	 */
	public long ts() {
		return ((((((year * 100L) + month) * 100) + day) * 100 + hr) * 100 + min);
	}

	/**
	 * Seconds since January 1st 1970 00:00h
	 * 
	 * @return
	 */
	private long uts() {
		return min * 60 + hr * 3600L + day * 86400 + (year - 1970) * 31536000 + ((year - 1969) / 4) * 86400
				- ((year - 1900 - 1) / 100) * 86400 + ((year - 1900 + 299) / 400) * 86400;
	}

	/**
	 * The difference between this TimeDate object and another one in 
	 * seconds.<br>
	 *
	 *
	 * @param o
	 *            the DateTime object for which to calculate the distance to this
	 *            object
	 * @return the difference in seconds
	 */
	public long diff(DateTime o) {
		if (o == null)
			return Long.MAX_VALUE;
		return Math.abs(uts() - o.uts());
	}

}
