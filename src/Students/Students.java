package Students;

import java.io.Serializable;

public class Students implements Serializable, Comparable <Students> {
    private String name;
    private String surname;
    private int rating;

    public Students(){
        this.name=name;
        this.surname=surname;
        this.rating=rating;

    }

    public Students(String name, String surname) {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Students o) {
        if (this.getRating() > o.getRating()) return 1;
        else if(this.getRating() < o.getRating()) return -1;
        else return 0;
    }
}
