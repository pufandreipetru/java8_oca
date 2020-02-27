package oca.chapter2.alexandra_petre.legalReturnTypes.override;

public class OverrideExample1 {
    Animal doSomething(String somethingToDo) {
        System.out.println("I'm doing something in example 1 and returning an Animal");
        return new Animal();
    }

//    Dog doSomething(String somethingToDo) {
//        System.out.println("I'm doing something in example 1 and returning a Dog");
//        return new Dog();
//    }
}
