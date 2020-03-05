package oca.chapter3.cristina_nan.scope;

public class Layout2 {

	static int x; // static variable

	// initialization block
	{
		x += 5;
		System.out.println("x in init block: " + x);
	}

	// constructor
	Layout2() {
		x += 10;
		System.out.println("x in constructor: " + x);
	}

	public static void main(String[] args) {
		new Layout();
		System.out.println("x after call constructor: " + x);

		display();
		System.out.println("x after call display: " + x);
	}

	static void display() {
		int y = 0; // y is a local variable
		for (int z = 0; z < 2; z++) { // z is a block variable
			x += y + z;
			y++;
		}
	}

}
