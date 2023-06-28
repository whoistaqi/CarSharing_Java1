package CarSharing.util;
import CarSharing.entities.*;
import java.util.Comparator;

public class StatusComparator {
    public int compare(Trip t1, Trip t2) {
        return t1.getStatus().compareTo(t2.getStatus());
    }
}
