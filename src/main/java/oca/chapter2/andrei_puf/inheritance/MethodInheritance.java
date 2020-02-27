package oca.chapter2.andrei_puf.inheritance;


import static java.lang.System.*;

class Car {
	public void start() {
		out.println("Car starts.");
	}
}

class BMW extends Car {
	public void start() {
		out.println("BMW starts.");
	}
	public void start(int temp) {
		out.println("BMW starts with engine at " + temp + "degrees");
	}
}

public class MethodInheritance {
	
	public static void main(String[] args) {
		Car car = new BMW();
		car.start();
	}
}
