package oca.chapter1.automotive;

public class Bmw implements Car {
	
	public void run() {System.out.println("BMW");}
	public static void main(String... args) {
		 Car car = new Bmw();
		car.run(); 
	}
}
