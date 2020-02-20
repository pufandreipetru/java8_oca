package oca.chapter2.andrei_puf.encapsulation;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        EncapsulateMe encapsulateMe = new EncapsulateMe();
        encapsulateMe.size = 2;
        out.println(encapsulateMe.doubleTheSize());
    }
}
