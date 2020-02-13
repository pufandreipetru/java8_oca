package oca.chapter1.enumerable;

import static java.lang.System.*;

enum CoffeSize { SMALL, BIG, HUGE, OVERWHELMING}

interface Drink {
	void setSize(CoffeSize size);
}

class Coffe implements Drink {
	private CoffeSize size;
	
	public void setSize(CoffeSize size) {
		this.size = size;
	}
	public String toString() {
		return "This coffe is " + size;
	}
}

public class CoffeExample {
	public static void main(String[] args) {
		Drink coffe = new Coffe();
		coffe.setSize(CoffeSize.HUGE);
		out.println(coffe.toString());		
	}
	
}
