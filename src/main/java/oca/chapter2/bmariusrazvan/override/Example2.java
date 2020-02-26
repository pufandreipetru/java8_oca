package override;

class A {
    static void calculate(int a, int b) {
        System.out.println("Class A");
    }
}

class B extends A {
    //@Override
    static void calculate(int a, int b) {
        System.out.println("Class B");
    }
}

public class Example2 {
    // Is this possible? How about for final?
}
