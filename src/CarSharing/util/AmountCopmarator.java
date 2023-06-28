package CarSharing.util;
import CarSharing.entities.*;
import java.util.Comparator;

public class AmountCopmarator implements Comparator<Trip>{
    public int compare(Trip t1, Trip t2){
        return Integer.compare(t1.total(), t2.total());
    }
}