package CarSharing.provided;

import CarSharing.entities.Trip;


/**
 * A formatter for trips.<br>
 * 
 * 
 * This formatter creates a string representation of a trip containing the following information
 * <ul>
 * <li>status</li>
 * <li>start time</li>
 * <li>end time</li>
 * <li>duration</li>
 * <li>distance</li>
 * <li>amount</li>
 * <li>rate</li>
 * </ul>
 * 
 * Unknown dates and locations are represented y the string "unknown"
 * 
 * @ProgrammingProblem.Hint use TripStatus.name() to convert status to String
 * @ProgrammingProblem.Hint "%10s %16.16s %16.16s %8d min %5.1f km %8d.%02d EUR (%s)"
 * 
 * 
 */
public class LongFormat extends Formatter<Trip> {
    @Override
    public String format(Trip trip) {
        return String.format("%10s %16.16s %16.16s %8d min %5.1f km %8d.%02d EUR (%s)", 
        		trip.getStatus().name(), 
        		trip.getStartTime()==null?"(unknown)":trip.getStartTime(),
        				trip.getEndTime()==null?"(unknown)":trip.getEndTime(),
        						trip.duration()/60,
        						trip.getDistance(),
        						trip.total()/100, trip.total()%100, trip.getRate());
    }
}
