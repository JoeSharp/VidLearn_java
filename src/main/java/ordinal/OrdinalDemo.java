package ordinal;

public class OrdinalDemo {

    enum RainbowColour { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }

    public static void main(String[] args) {
        for (RainbowColour r : RainbowColour.values()) {
            System.out.println(String.format("Rainbow Colour %s - Ordinal %d", r, r.ordinal()));
        }

        String name = "Joe Sharp";
        for (char c : name.toCharArray()) {
            System.out.println(String.format("%s - %d", c, (int) c));
        }
    }
}
