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
}
