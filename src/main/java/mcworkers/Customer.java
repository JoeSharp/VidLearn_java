package mcworkers;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Customer {
    static final Random random = new Random();
    static final List<String> OPTIONS = Stream.of("Burger", "Wrap", "Drink")
            .collect(Collectors.toList());

    Dish receivedDish;
    String receivedOrder;

    String requestOrder() {
        return OPTIONS.get(random.nextInt(OPTIONS.size()));
    }

    void giveOrder(String order, Dish dish) {
        receivedOrder = order;
        receivedDish = dish;
        receivedDish.use();
    }

    Dish handBackDirtyDish() {
        Dish toReturn = this.receivedDish;
        this.receivedDish = null;
        return toReturn;
    }
}
