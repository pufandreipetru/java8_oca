package oca.chapter2.cristina_nan.implementing_an_interface;

public interface DisplayInterface {

	void display();

	default void display1() {
		System.err.println("default bounce Bounceable");
	}

	static void display2() {
		System.err.println("static bounce Bounceable");
	}

}
