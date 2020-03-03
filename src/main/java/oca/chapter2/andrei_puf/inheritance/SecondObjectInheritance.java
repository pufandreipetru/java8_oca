package oca.chapter2.andrei_puf.inheritance;

import static java.lang.System.*; 


abstract class Animal { 
	public void run() {
		out.println("I am running.");
	}
}

class AbleToClimb {
	public static void climb() {
		out.println("I am climbing a tree");
	}
}

interface Climbable {
	void climb();
}

class Cat extends Animal implements Climbable {
	
	public void climb() {
		AbleToClimb.climb();
	}
}

interface Flyable {
	void fly();
}

class Bird extends Animal implements Flyable {
	public void fly() {
		out.println("I am flying");
	}

}

class Monkey extends Animal implements Climbable {
	public void climb() {
		AbleToClimb.climb();
	}
}


public class SecondObjectInheritance {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.run();
		Cat cat = new Cat();
		cat.climb();
		cat.run();	
	}
}
