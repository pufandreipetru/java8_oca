package oca.chapter6.cristina_nan.string_stringbuilder;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abc");

		s.append("efg");
		System.out.println("s is: " + s);

		s.reverse().insert(2, "XXXX");
		System.out.println("s is: " + s);

		s.reverse().insert(15, "YYYY");
		System.out.println("s is: " + s);
	}

}
