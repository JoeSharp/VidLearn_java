package composition;

public class Main {
    public static void main(String[] args) {
        final StarSystem solarSystem = new StarSystem()
                .with(new Star("The Sun", 333000,"Yellow Dwarf"))
                .and(new Planet("Mercury", 0.1, "grey"))
                .and(new Planet("Venus", 0.5, "orange"))
                .and(new Planet("Earth", 1, "blue"))
                .and(new Planet("Mars", 0.8, "red"))
                .and(new Planet("Jupiter", 2000, "brown"))
                .and(new Planet("Saturn", 1500, "yellow"))
                .and(new Planet("Uranus", 300, "lightblue"))
                .and(new Planet("Neptune", 200, "blue"));

        final StarSystem alphaCenturai = new StarSystem()
                .with(new Star("Rigil Kentaurus", 3004, "Yellow Dwarf"))
                .and(new Star("Toliman", 2000, "Yellow Dwarf"))
                .and(new Star("Proxima Centauri", 200, "red dwarf"));

        System.out.println(solarSystem);
        System.out.println(alphaCenturai);
    }
}
