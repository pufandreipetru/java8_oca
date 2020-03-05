package oca.chapter2.cristina_nan.implementing_an_interface;

public class TestInterfaces {

	public static void main(String[] args) {
		Ball ball = new Ball();
		ball.bounce();
		ball.move();

		DisplayInterface display = new Display();
		Display d = new Display();
		d.display1();
		d.display2();

		Display dA = new DisplayA();
		dA.display2();
	}

}
