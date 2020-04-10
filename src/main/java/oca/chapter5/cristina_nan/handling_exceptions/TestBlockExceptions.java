package oca.chapter5.cristina_nan.handling_exceptions;

public class TestBlockExceptions {

	public static void main(String[] args) {
		doStuff();
	}

	static void doStuff() {
		try {
			doMoreStuff();
		} catch (Exception e) {
			System.err.println("doStuff - Here in catch block");
		}
	}

	static void doMoreStuff() {
		try {
			int x = 10;
			System.err.println(x / 0);
			System.exit(0);
			return;
		} finally {
			System.err.println("doMoreStuff - Here in finally block");
		}
	}

}
