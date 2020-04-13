package oca.chapter6.cristina_nan.string_stringbuilder;

public class StringExample1 {

	public static void main(String[] args) {
		// String s = new String();
		// String s = new String("abcdef");
		String s = "abcdef";
		String s2 = s;

		s.concat(" more stuff");
		System.out.println("s: " + s);
		System.out.println("s2: " + s2);

		s.toUpperCase();
		System.out.println("s: " + s);
		System.err.println("s2: " + s2);

		s.replace("a", "A");
		System.out.println("s: " + s);
		System.out.println("s2: " + s2);

		s = s.concat(" more stuff");
		System.out.println("s: " + s);
		System.out.println("s2: " + s2);
	}

}
