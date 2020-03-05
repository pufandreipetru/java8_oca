package oca.chapter3.cristina_nan.variable_initialization;

public class StudentDetail {
	int age; // instance variable

	public static void main(String[] args) {
		StudentDetail st = new StudentDetail();
		st.showAge();
	}

	void showAge() {
		System.out.println("The age of student is: " + age);
	}

}
