package software.ulpgc.kata2;

public class Flight {
    private final int year;
    private final String month;
    private final int passengers;

    public Flight(String year, String month, String passengers) {
        this.year = Integer.parseInt(year);
        this.month = month;
        this.passengers = Integer.parseInt(passengers);
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
