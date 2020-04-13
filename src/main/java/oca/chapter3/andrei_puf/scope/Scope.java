package oca.chapter3.andrei_puf.scope;

import static java.lang.System.*;

public class Scope {
    static class A {
        int x = 2;
    }

    public static void main(String... args) {
        A a = new A();
        modify(a);
        out.println(a.x);

        int x = 2;
        addOne(x);
        out.println(x);

        int[] xx = new int[1];
        xx[0] = 1;
        addOne(xx);
        out.println(xx[0]);
    }

    private static void addOne(int[] xx) {
        xx[0] = xx[0] + 1;
    }

    public static void addOne(Integer x) {
        x = x + 1;
    }

    public static void modify(A a) {
        a.x = a.x + 1;
    }
}