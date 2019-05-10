package house;

import java.util.ArrayList;
import java.util.List;

public class Habitation {
    private static final int MIN_MESSAGE_LENGTH = 10;
    private final String name;
    private List<String> postedMessages = new ArrayList<>();

    Habitation(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void postMessage(final String message) {
        if (checkMessage(message)) {
            this.postedMessages.add(message);
        } else {
            throw new IllegalArgumentException(
                    String.format("Message must be at least %d characters",
                            MIN_MESSAGE_LENGTH));
        }
    }

    protected List<String> readMessages() {
        return List.copyOf(postedMessages);
    }

    private boolean checkMessage(final String message) {
        return message.length() > 10;
    }
}

