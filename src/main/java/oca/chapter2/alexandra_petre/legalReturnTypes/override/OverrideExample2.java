package oca.chapter2.alexandra_petre.legalReturnTypes.override;

public class OverrideExample2 extends OverrideExample1 {
    Animal doSomething(String somethingToDo) {
        System.out.println("I'm doing something in example 2 and returning a Dog");
        return new Dog();
    }
}
