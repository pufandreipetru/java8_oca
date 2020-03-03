package oca.chapter2.alexandra_petre.initBlocks;

public class Animal {
    {
        System.out.println("Init block 1: Animal");
    }

    static {
        System.out.println("Static block 1: Animal");
    }

    public Animal() {
        System.out.println("Animal constructor");
    }

    {
        System.out.println("Init block 2: Animal");
    }

    static {
        System.out.println("Static block 2: Animal");
    }
}
