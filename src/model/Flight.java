package model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Flight {
    
    public final int dayOfWeek;
    public final int departureTime;
    public final int departureDelay;
    public final int arrivalTime;
    public final int arrivalDelay;
    public final int duration;
    public final int distance;
    public final int cancelled;
    public final int diverted;

    public Flight(int dayOfWeek, int departureTime, int departureDelay, int arrivalTime, int arrivalDelay, int duration, int distance, int cancelled, int diverted) {
        this.dayOfWeek = dayOfWeek;
        this.departureTime = departureTime;
        this.departureDelay = departureDelay;
        this.arrivalTime = arrivalTime;
        this.arrivalDelay = arrivalDelay;
        this.duration = duration;
        this.distance = distance;
        this.cancelled = cancelled;
        this.diverted = diverted;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public int getDepartureDelay() {
        return departureDelay;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getArrivalDelay() {
        return arrivalDelay;
    }

    public int getDuration() {
        return duration;
    }

    public int getDistance() {
        return distance;
    }

    public int isCancelled() {
        return cancelled;
    }

    public int isDiverted() {
        return diverted;
    }

    @Override
    public String toString() {
        return "Flight{" + "dayOfWeek=" + dayOfWeek + ", departureTime=" + departureTime + ", departureDelay=" + departureDelay + ", arrivalTime=" + arrivalTime + ", arrivalDelay=" + arrivalDelay + ", duration=" + duration + ", distance=" + distance + ", cancelled=" + cancelled + ", diverted=" + diverted + '}';
    }
}
