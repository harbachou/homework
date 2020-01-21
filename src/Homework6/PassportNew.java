package Homework6;


import java.util.Date;
import java.util.Objects;

public class PassportNew {
    private String id;
    private Date effectiveAt;
    private String fio;

    public PassportNew(String id, Date effectiveAt, String fio) {
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportNew passport = (PassportNew) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

