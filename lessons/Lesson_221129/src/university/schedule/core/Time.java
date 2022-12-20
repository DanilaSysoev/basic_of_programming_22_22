package university.schedule.core;

import java.util.Objects;

public class Time implements Comparable<Time> {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        setupProperties(hours, minutes);
    }

    public Time(int minutes) {
        setupProperties(hours, minutes);
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }

    public Time addHours(int hours) {
        return new Time(this.hours + hours, this.minutes);
    }

    public Time addMinutes(int minutes) {
        return new Time(this.hours, this.minutes + minutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours && minutes == time.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes);
    }

    @Override
    public String toString() {
        return "%02d:%02d".formatted(hours, minutes);
    }

    @Override
    public int compareTo(Time o) {
        int totalMinutes = getTotalMinutes(hours, minutes);
        int oTotalMinutes = getTotalMinutes(o.hours, o.minutes);
        return totalMinutes - oTotalMinutes;
    }

    private void setupProperties(int hours, int minutes) {
        int totalMinutes = getTotalMinutes(hours, minutes);
        totalMinutes -= totalMinutes / (24 * 60) * (24 * 60);
        totalMinutes += (24 * 60);
        totalMinutes %= (24 * 60);

        this.hours = (totalMinutes / 60);
        this.minutes = totalMinutes % 60;
    }

    private static int getTotalMinutes(int hours, int minutes) {
        return hours * 60 + minutes;
    }
}
