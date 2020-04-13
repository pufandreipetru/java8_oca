package oca.chapter5.cristina_nan.handling_exceptions;

public class Example1 {

	public static void main(String[] args) {
		try {
			foo();
		} catch (NullPointerException e) {
			System.out.println("catch NullPointerException");
		} catch (Exception e) {
			System.out.println("catch Exception");
		}

		bar();
	}

	public static void foo() throws NullPointerException {
		System.out.println("foo");

	}

	public static void bar() {
		System.out.println("bar");

	}
}
