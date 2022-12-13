package university.schedule.core;

import java.util.Objects;

public class Housing extends NamedEntity {
    private final String address;

    public Housing(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Housing housing = (Housing) o;
        return Objects.equals(getName(), housing.getName()) && Objects.equals(address, housing.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), address);
    }
    @Override
    public String toString() {
        return "%s: %s".formatted(getName(), address);
    }
}
