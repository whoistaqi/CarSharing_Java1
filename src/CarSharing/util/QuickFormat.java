package CarSharing.util;

import CarSharing.entities.*;
import CarSharing.provided.*;


public class QuickFormat
        extends Formatter<Trip> {

    @Override
    public String format(Trip trip) {
        return String.format("%8d min %5.1f km %8d.%02d EUR", trip.duration(), trip.getDistance(), trip.total() / 100, trip.total() % 100);
    }
}