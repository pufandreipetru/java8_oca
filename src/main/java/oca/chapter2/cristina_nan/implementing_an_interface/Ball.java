package oca.chapter2.cristina_nan.implementing_an_interface;

public class Ball implements Bounceable {

	@Override
	public void bounce() {
		System.out.println("bounce Ball");
	}

	@Override
	public void setBounceFactor(int bf) {
		System.out.println("bounce factor Ball");
	}

	@Override
	public void move() {
		System.out.println("move Ball");
	}

}
