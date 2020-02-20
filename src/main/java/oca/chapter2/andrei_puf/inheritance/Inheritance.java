package oca.chapter2.andrei_puf.inheritance;

import static java.lang.System.out;

interface MyInterface {
	void doSomething();
}
abstract class MyBase implements MyInterface {

}

public class Inheritance extends MyBase {
	
	public void doSomething() {
		out.println("I am doing something");
	}	

	public static void main(String[] args) {
		Inheritance inh = new Inheritance();

		out.println("inh is instance of Inheritance " + (inh instanceof Inheritance));
		
		out.println("inh is instance of MyBase " + (inh instanceof MyBase));

		out.println("inh is instance of MyInterface " + (inh instanceof MyInterface));
		
		out.println("inh is instance of Object " + (inh instanceof Object));

		out.println("int is instance of Runnable " + (inh instanceof Runnable));		
	}	
}
