package mcworkers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Dish> availableDishes = IntStream.range(0, 5)
                .mapToObj(i -> new Dish())
                .collect(Collectors.toList());
        Floor theFloor = new Floor();
        Customer customer1 = new Customer();

        // Define both team members
        Chef teamMember1 = new Chef();
        Cashier teamMember2 = new Cashier();

        teamMember1.cookFood("Burgers");
        teamMember2.serveCustomer(customer1, availableDishes);
        Dish dirtyDish = customer1.handBackDirtyDish();

        // Either team member can do the basic cleaning tasks
        teamMember1.mopFloor(theFloor);
        teamMember2.washUp(dirtyDish);

    }
}
