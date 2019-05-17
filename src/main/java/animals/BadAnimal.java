package animals;

public class BadAnimal {
    private final String species;

    BadAnimal(final String species) {
        this.species = species;
    }

    void speak() {
        switch (this.species) {
            case "Dog":
                System.out.println("Woof");
            case "Cat":
                System.out.println("Miaow");
            case "Mouse":
                System.out.println("Squeek");
        }
    }
}
