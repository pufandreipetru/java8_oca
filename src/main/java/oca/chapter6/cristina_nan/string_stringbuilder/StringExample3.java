package oca.chapter6.cristina_nan.string_stringbuilder;

public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");

		System.out.println(s1 + " = " + s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
