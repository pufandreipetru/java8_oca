package oca.chapter1.interfaces;

public class BallImplementation implements Ball {
    @Override
    public void throwBall() {
        System.out.println("Throw ball");
    }

    @Override
    public void roll() {
        System.out.println("Roll ball");
    }

    @Override
    public void roll1() {
        System.out.println("Roll1 ball");
    }

    @Override
    public void roll2() {
        System.out.println("Roll2 ball");
    }

//
//    public void action() {
//        System.out.println("Ball action in implementation");
//    }
//
//    public static void staticAction() {
//        System.out.println("Ball static action in implementation");
//    }
}
