package basic;

public class Greeter {
    private final String name;

    private Greeter(final String name) {
        this.name = name;
    }

    private void sayHello(final String toGreet) {
        final String greeting = String.format("Hello %s, my name is %s", toGreet, this.name);
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        final Greeter bob = new Greeter("Bob");
        bob.sayHello("Alice");
        bob.sayHello("Jim");

        final Greeter lucy = new Greeter("Lucy");
        lucy.sayHello("Joe");
        lucy.sayHello("Hannah");
    }
}
