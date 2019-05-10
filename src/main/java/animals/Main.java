package animals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demonstrating Polymorphism");

        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        List<Animal> animals = Stream.of(myAnimal, myDog, myCat)
                .collect(Collectors.toList());

        animals.forEach(Animal::speak);
    }
}
