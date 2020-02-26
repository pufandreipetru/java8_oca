package override;

class Animal {
    public void eat() throws Exception {
        // something
    }
}

class Dog extends Animal {
    public void eat() {
        // woof
    }
}

public class Example3 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        dog.eat();
        //animal.eat();

        //What is the output?
    }
}
