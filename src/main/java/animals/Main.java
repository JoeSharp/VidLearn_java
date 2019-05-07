package animals;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demonstrating Polymorphism");

        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        Stream.of(myAnimal, myDog, myCat).forEach(Animal::speak);
    }
}
