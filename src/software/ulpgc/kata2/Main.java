package software.ulpgc.kata2;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightLoader loader = new TsvFileFlightLoader(new File("flights.txt"));
        List<Flight> flights = loader.load();
        for (Flight flight : flights) {
            System.out.println(flight.getYear() + ", " + flight.getMonth() + ": " + flight.getPassengers());
        }
    }
}
