package greeter;

/**
 * Demonstrate methods and static methods.
 */
class Greeter {
    private static final String GREETING_TEMPLATE = "Hello %s";
    private static final String GREETING_AND_INTRO_TEMPLATE = "Hello %s, my name is %s";

    private final String name;

    Greeter(final String name) {
        this.name = name;
    }

    /**
     * This must be called on an instance, so that the greeter can introduce themselves.
     * @param greeted The name of the person to greet.
     * @return A greeting and introducting string.
     */
    String generateIntroductionAndGreeting(final String greeted) {
        return String.format(GREETING_AND_INTRO_TEMPLATE, greeted, this.name);
    }

    /**
     * This can be called on the class to enerat
     * @param greeted The name of the person to greet.
     * @return A greeting string
     */
    static String generateGreeting(final String greeted) {
        return String.format(GREETING_TEMPLATE, greeted);
    }
}
