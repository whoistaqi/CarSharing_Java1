package CarSharing.entities;

import CarSharing.provided.TripStatus;

public class LongTermRate extends Rate{

    private int baseAmount;
    private int baseDuration = 1;
    private int perDay;

    public LongTermRate(int baseAmount, int perDay) {
        this.baseAmount = baseAmount;
        this.perDay = perDay;
    }



    @Override
    public int total(Trip trip) {
        if (trip.getStatus() == TripStatus.COMPLETED)
            return baseAmount + ((trip.duration() - baseDuration) * perDay);
        else
            return 0;
    }

    @Override
    public String toString() {
        return "LongTermRate{" +
                "baseAmount=" + baseAmount +
                ", baseDuration=" + baseDuration +
                ", perDay=" + perDay +
                '}';
    }
}
