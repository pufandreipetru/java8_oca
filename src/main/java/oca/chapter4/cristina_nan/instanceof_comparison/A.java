package oca.chapter4.cristina_nan.instanceof_comparison;

public class A {

	public static void main(String[] args) {
		String s = new String("abcd");
		if (s instanceof String)
			System.err.println("This is a String");
		if (s instanceof Object)
			System.err.println("This is a Object");

		boolean b = null instanceof Object;
		System.err.println("b is: " + b);

		boolean c = null instanceof String;
		System.err.println("c is: " + c);

		int[] nums = new int[10];
		System.err.println("num is: " + (nums instanceof Object));
	}

}
