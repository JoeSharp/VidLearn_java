package house;

public class House extends Habitation {

    public House(final String name) {
        super(name);
    }

    public int getNumberMessagesWaiting() {
        return readMessages().size();
    }
}
