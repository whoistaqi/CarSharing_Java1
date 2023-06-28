package CarSharing.entities;

import CarSharing.provided.TripStatus;

public class PerMinuteRate extends Rate{
    private int perMinute;

    public PerMinuteRate(int perMinute) {
        try{
        this.perMinute = perMinute;
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument!");
        }
    }

    public int total(Trip t) {
        if (t.getStatus() == TripStatus.COMPLETED) {
            return perMinute * t.duration();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "PerMinuteRate{" +
                "perMinute=" + perMinute +
                '}';
    }
}
