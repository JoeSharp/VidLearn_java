package mcworkers;

import java.util.List;
import java.util.Random;

class Cashier extends TeamMember {
    final Random random = new Random();

    void serveCustomer(Customer customer, final List<Dish> dishes) {
        String order = customer.requestOrder();
        customer.giveOrder(order, dishes.remove(0));
    }
}
