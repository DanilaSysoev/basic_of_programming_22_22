package university.schedule.core;

import java.util.Objects;

public class Subject extends NamedEntity {
    private final int hours;
    private final MonitoringType monitoringType;

    public Subject(String name, int hours, MonitoringType monitoringType) {
        super(name);
        this.hours = hours;
        this.monitoringType = monitoringType;
    }

    public int getHours() {
        return hours;
    }
    public MonitoringType getMonitoringType() {
        return monitoringType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Subject subject = (Subject) o;
        return hours == subject.hours &&
               Objects.equals(monitoringType, subject.monitoringType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, monitoringType);
    }
}
