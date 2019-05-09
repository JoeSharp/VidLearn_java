package composition;

public class Planet extends GravitationalBody {
    private final String colour;

    Planet(final String name,
                  final double mass,
                  final String colour) {
        super(name, mass);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "colour='" + colour + '\'' +
                "} " + super.toString();
    }
}
