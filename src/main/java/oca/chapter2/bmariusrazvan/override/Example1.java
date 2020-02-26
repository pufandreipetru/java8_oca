package override;

class X {
    void method(int a) {
        System.out.println("ONE");
    }

    void method(double d) {
        System.out.println("TWO");
    }
}

class Y extends X {
    void method(int i) {
        super.method(i);
    }

    void method(double d) {
        System.out.println("THREE");
    }
}

public class Example1 {
    public static void main(String[] args) {
        new Y().method(100); // ?
        new Y().method(10.24); // ?
    }
}
