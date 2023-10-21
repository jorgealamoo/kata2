package software.ulpgc.kata2;

public class Flight {
    private final int year;
    private final String month;
    private final int passengers;

    public Flight(int year, String month, int passengers) {
        this.year = year;
        this.month = month;
        this.passengers = passengers;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "year=" + year +
                ", month='" + month + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
