package oca.chapter2.andrei_puf.composition;

import static java.lang.System.*;

class Engine {
	public void start() {
		out.println("Start engine");
	}
}

class Breaks {
	public void stop() {
	  	out.println("Stop");
	}
}

class Wheel {
	private int index;
	public Wheel(int index) {
		this.index = index;
	}
	public void turn() {
		out.println("Turn weel number " + index);
	}
}

public class Car {
	private Engine engine;
	private Breaks breaks;
	private Wheel[] wheels;

	public Car() {
		this.engine = new Engine();
		this.breaks = new Breaks();
		this.wheels = new Wheel[4];
		this.wheels[0] = new Wheel(1);
		this.wheels[1] = new Wheel(2);
		this.wheels[2] = new Wheel(3);
		this.wheels[3] = new Wheel(4);
		
	}

	public void start() {
		this.engine.start();
	}
	
	public void drive() {
		for(int i=0; i<4; i++) {
			this.wheels[i].turn();
		}
	}

	public void stop() {
		out.println("Stopping the car");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.drive();
		car.stop();
	}
}
