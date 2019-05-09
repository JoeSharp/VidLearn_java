package people;

public class Main {
    public static void main(String[] args) {
        Address myHouse = new Address("Flat 1",
                "Main Street",
                "Springfield",
                "GA4 5AA");

        Person me = new Person("Bob Fleming", myHouse);

        System.out.println(me);
    }
}
