package composition;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StarSystem {
    private final Star star;
    private final List<Planet> planets;

    StarSystem(final Star star, Planet...planets) {
        this.star = star;
        this.planets = Stream.of(planets).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "star=" + star +
                ", planets=" + planets +
                '}';
    }
}
