package chapter1.classes;

import java.util.Collections;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println(Collections.EMPTY_LIST + " - first class");

        MySecondClass mySecondClass = new MySecondClass();
        mySecondClass.testSecond();
    }
}

//private class MySecondClass {
//
//}

//public class MySecondClass {
//}

//package chapter1.classes;
//import java.util.Arrays;

class MySecondClass {
    public void testSecond() {
        System.out.println(Collections.EMPTY_LIST + " - second class");
    }
}