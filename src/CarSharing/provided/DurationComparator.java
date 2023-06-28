package CarSharing.provided;

import java.util.Comparator;

import CarSharing.entities.Trip;


/**
 * Comparator comparing two trips by trip duration.<br>
 * 
 * 
 */
public class DurationComparator implements Comparator<Trip> {

	@Override
	public int compare(Trip o1, Trip o2) {
		return Integer.compare(o1.duration(), o2.duration());
	}

}
