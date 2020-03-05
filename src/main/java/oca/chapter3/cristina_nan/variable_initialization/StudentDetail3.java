package oca.chapter3.cristina_nan.variable_initialization;

public class StudentDetail3 {
	static int age;

	public static void main(String[] args) {
		System.out.println("age is: " + age);
		int schoolNr;

		System.out.println("schoolNr is: " + schoolNr);
		if (args[0] != null) {
			schoolNr = 10;
			System.out.println("schoolNr is: " + schoolNr);
		}

		int courseNr = schoolNr;
		System.out.println("courseNr is: " + courseNr);
	}

}
