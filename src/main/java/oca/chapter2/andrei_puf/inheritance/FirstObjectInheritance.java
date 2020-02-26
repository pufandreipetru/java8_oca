package oca.chapter2.andrei_puf.inheritance;

import static java.lang.System.*; 

abstract class Animal { 
	public void run() {
		out.println("I am running.");
	}
		
	public abstract void fly() throws NoSuchMethodException;

	public abstract void climb() throws NoSuchMethodException;
}

class Cat extends Animal {
	public void fly() throws NoSuchMethodException {
		throw new NoSuchMethodException();
	}
	
	public void climb() throws NoSuchMethodException {
		out.println("I am climbing a tree");
	}
	
}

class Bird extends Animal {
	public void fly() throws NoSuchMethodException {
		out.println("I am flying");
	}
	
	public void climb() throws NoSuchMethodException {
		throw new NoSuchMethodException();
	}

}

public class FirstObjectInheritance {

	public static void main(String[] args) throws NoSuchMethodException {
		Bird bird = new Bird();
		bird.fly();
		bird.run();
		bird.climb();	
		Cat cat = new Cat();
		cat.climb();
		cat.run();
		cat.fly();
	}
}
