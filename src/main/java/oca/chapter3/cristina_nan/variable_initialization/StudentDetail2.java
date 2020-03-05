package oca.chapter3.cristina_nan.variable_initialization;

public class StudentDetail2 {
	private String name; // instance reference variable

	public static void main(String[] args) {
		StudentDetail2 st = new StudentDetail2();
		st.showName();
		System.out.println(st.name.toLowerCase());
	}

	void showName() {
		System.out.println("The name of student is: " + name);
	}

}
