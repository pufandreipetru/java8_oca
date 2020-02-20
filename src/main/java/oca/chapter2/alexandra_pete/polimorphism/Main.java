package oca.chapter2.alexandra_pete.polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Tory"));
        animalList.add(new Dog("Jimmy"));
        animalList.add(new Animal("Jasmine"));
        animalList.add(new Cat("Mitzu"));
        animalList.add(new Horse("Horsey"));
        animalList.add(new Animal("Human"));

        for (Animal animal: animalList) {
            animal.describe();
        }
    }
}
