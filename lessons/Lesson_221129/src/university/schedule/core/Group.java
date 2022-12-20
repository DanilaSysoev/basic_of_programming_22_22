package university.schedule.core;

import java.util.Objects;

public class Group {
    private final int number;
    private final int year;
    private final String direction;

    public Group(int number, int year, String direction) {
        this.number = number;
        this.year = year;
        this.direction = direction;
    }

    public int getNumber() {
        return number;
    }
    public int getYear() {
        return year;
    }
    public String getDirection() {
        return direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return number == group.number &&
               year == group.year &&
               Objects.equals(direction, group.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, year, direction);
    }
}
