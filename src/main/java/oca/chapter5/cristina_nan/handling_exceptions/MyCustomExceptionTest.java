package oca.chapter5.cristina_nan.handling_exceptions;

public class MyCustomExceptionTest {

	public static void main(String[] args) {
		try {
			display();
		} catch (Exception e) {
			System.out.println("main - catch block");
		} finally {
			System.out.println("main - finally block");
		}
	}

	static void display() {
		try {
			System.out.println(10 / 0);
		} catch (MyCustomException e) {
			System.out.println("display - catch block");
			throw e;
		} finally {
			System.out.println("display - finally block");
		}
	}

}
