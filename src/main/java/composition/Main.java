package composition;

public class Main {
    public static void main(String[] args) {
        final StarSystem solarSystem = new StarSystem(
                new Star("The Sun", 333000,"Yellow Dwarf"),
                new Planet("Mercury", 0.1, "grey"),
                new Planet("Venus", 0.5, "orange"),
                new Planet("Earth", 1, "blue"),
                new Planet("Mars", 0.8, "red"),
                new Planet("Jupiter", 2000, "brown"),
                new Planet("Saturn", 1500, "yellow"),
                new Planet("Uranus", 300, "lightblue"),
                new Planet("Neptune", 200, "blue")
        );

        final StarSystem starWars = new StarSystem(
                new Star("Death Star", 23, "Super Laser"),
                new Planet("Tatooine", 1, "sandy"),
                new Planet("hoth", 34, "white")
        );

        System.out.println(solarSystem);
        System.out.println(starWars);
    }
}
