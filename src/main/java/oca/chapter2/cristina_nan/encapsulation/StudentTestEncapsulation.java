package oca.chapter2.cristina_nan.encapsulation;

public class StudentTestEncapsulation {

	public static void main(String[] args) {

		StudentBadEncapsulation stBad = new StudentBadEncapsulation();
		stBad.age = 11; // legal but bad
		System.err.println("Bad encapsulation: " + stBad.getAge());

		StudentGoodEncapsulation stGood = new StudentGoodEncapsulation();
		stGood.setAge(15);
		System.err.println("Good encapsulation: " + stGood.getAge());

	}

}
