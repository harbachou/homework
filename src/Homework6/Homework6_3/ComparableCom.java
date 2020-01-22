package Homework6.Homework6_3;

public class ComparableCom implements Comparable<ComparableCom> {
    private String id;

    public String getId() {
        return id;
    }

    public ComparableCom (String id) {
        this.id = id;
    }

    @Override
    public int compareTo(ComparableCom o) {
        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString() {
        return "SortComparable{" +
                "id='" + id + '\'' +
                '}';
    }
}




