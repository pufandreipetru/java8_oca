package oca.chapter1.interfaces;

public class Main {
    public static void main(String[] args) {
        Ball ball = new BallImplementation();
        ball.action();

        Ball.staticAction();
        // ball.staticAction();
//        BallImplementation ballImplementation = new BallImplementation();
//        ballImplementation.staticAction();
    }
}
