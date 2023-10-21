package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvFileFlightLoader implements FlightLoader{
    private final File file;

    public TsvFileFlightLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Flight> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Flight> load(FileReader reader) throws IOException {
        return load(new BufferedReader(reader));
    }

    private List<Flight> load(BufferedReader reader) throws IOException {
        reader.readLine();
        List<Flight> flights = new ArrayList<>();
        while (true){
            String line = reader.readLine();
            if (line == null) return flights;
            flights.add(toFlight(line));
        }
    }

    private Flight toFlight(String line) {
        return toFlight(line.split("\t"));
    }

    private Flight toFlight(String[] split) {
        return new Flight(
                split[0],
                split[1],
                split[2]
        );
    }
}
