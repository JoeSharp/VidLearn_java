package composition;

public class Star extends GravitationalBody {
    private final String type;

    Star(final String name,
                final double mass,
                final String type) {
        super(name, mass);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Star{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
