package oca.chapter2.alexandra_petre.initBlocks;

public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog constructor");
    }

    {
        System.out.println("Init block 1: Dog");
    }

    static {
        System.out.println("Static block 1: Dog");
    }

    {
        System.out.println("Init block 2: Dog");
    }

    static {
        System.out.println("Static block 2: Dog");
    }
}
