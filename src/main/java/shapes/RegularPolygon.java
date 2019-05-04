package shapes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RegularPolygon {
    class Vertex {
        final double x;
        final double y;

        Vertex(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%.1f, %.1f)", x, y);
        }
    }

    private final String name;
    private final List<Vertex> vertices;

    RegularPolygon(final String name,
                   final int numberOfSides,
                   final int radius) {
        this.name = name;
        double angleStep = 2 * Math.PI / numberOfSides;
        vertices = IntStream.range(0, numberOfSides).mapToObj(c -> {
            double angle = c * angleStep;
            double x = radius * Math.sin(angle);
            double y = radius * Math.cos(angle);
            return new Vertex(x, y);
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return name + "{" + "vertices=" + vertices + '}';
    }
}
