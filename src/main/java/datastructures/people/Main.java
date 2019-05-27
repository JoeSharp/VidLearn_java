package datastructures.people;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String csvFilename = args[0];
        System.out.println(String.format("Reading People from %s", csvFilename));

        try (BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(csvFilename)))) {
            String line;
            while ((line = r.readLine()) != null){
                final Person person = Person.fromCsv(line);
                final String asStr = String.format(
                        "%s\n\tAge: %d\n\tFavourite Colour: %s",
                        person.getName(),
                        person.getAge(),
                        person.getFavouriteColour());
                System.out.println(asStr);
            }
            r.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
