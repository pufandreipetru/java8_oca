package oca.chapter1.enumerable.switchable;

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

public class CoffeExampleSwitch {

	public static void main(String[] args) {
		String size = args[0];
		CoffeSize coffeSize = CoffeSize.valueOf(size);
		Drink coffe = new Coffe();
		coffe.setSize(coffeSize);
		out.println(coffe.toString());		
	}
	
}
