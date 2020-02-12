package chapter1.abstractclazz;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(this.name + " is eating");
	}	

	public void makeNoise() {
		System.out.println(this.name + " is barking");
	}
}
