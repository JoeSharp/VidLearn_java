package greeter;

public class Main {
    public static void main(String[] args) {
        final Greeter bob = new Greeter("Bob");
        final String bobGreetsLucy = bob.generateIntroductionAndGreeting("Lucy");
        System.out.println(bobGreetsLucy);

        final String greetAlice = Greeter.generateGreeting("Alice");
        System.out.println(greetAlice);
    }
}
