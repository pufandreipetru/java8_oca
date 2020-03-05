package oca.chapter3.cristina_nan.scope;

public class ScopeErrors {
	int x = 5;

	public static void main(String[] args) {
		ScopeErrors s = new ScopeErrors();
		s.display();
	}

	void display() {
		int y = 5;

		display2(y);
		System.err.println("y in display is: " + y);
		y++; // once display2() completes, y is back in scope
		System.err.println("y in display after call display2 is: " + y);
		display3();
	}

	void display2(int... y) {
		y[0]++;
	}

	void display3() {
		for (int z = 0; z < 6; z++) {
			boolean var;
			if (z == 2) {
				var = true;
				break;
			}
		}
		System.err.println("var in display3 is: " + var);
	}

}
