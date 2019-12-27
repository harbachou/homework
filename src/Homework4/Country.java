package Homework4;

public enum Country {
    Belarus(207595, 9500000),
    Poland(312679, 37980000),
    Spain(505590, 46660000),
    Italian(301338, 60480000),
    France(643801, 66990000),
    Portugal(92212, 10290000),
    Finland(338424, 5513000),
    Norway(385203, 5328000),
    Germany(357386, 82790000),
    Japan(377973, 126800000);
    public final int Area;
    public final int Population;

    Country(int Area, int Population) {
        this.Area = Area;
        this.Population = Population;
    }
}
