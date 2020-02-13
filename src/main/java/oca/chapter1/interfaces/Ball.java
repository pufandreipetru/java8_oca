package oca.chapter1.interfaces;

public interface Ball extends Rollable {
    void throwBall();

    default void action() {
        System.out.println("Ball action");
    }

    static void staticAction() {
        System.out.println("Ball static action");
    }
}
