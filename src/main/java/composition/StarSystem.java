package composition;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private final List<Star> stars = new ArrayList<>();
    private final List<Planet> planets = new ArrayList<>();

    StarSystem with(final GravitationalBody body) {
        if (body instanceof Star) {
            stars.add((Star) body);
        } else if (body instanceof Planet) {
            planets.add((Planet) body);
        }
        return this;
    }

    StarSystem and(final GravitationalBody body) {
        return with(body);
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "stars=" + stars +
                ", planets=" + planets +
                '}';
    }
}
