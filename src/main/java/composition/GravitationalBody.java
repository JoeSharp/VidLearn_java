package composition;

public class GravitationalBody {
    private final String name;
    private final double mass;

    GravitationalBody(final String name,
                             final double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "GravitationalBody{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
