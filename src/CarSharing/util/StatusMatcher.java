package CarSharing.util;
import CarSharing.entities.*;
import CarSharing.provided.Matcher;
import CarSharing.provided.TripStatus;

public class StatusMatcher extends Matcher<Trip> {
    private TripStatus status;

    public StatusMatcher (TripStatus status){
        this.status = status;
    }
    public boolean matches(Trip t){
        return t.getStatus() == status;
    }

}
