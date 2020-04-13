package oca.chapter6.cristina_nan.string_stringbuilder;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = s1 + "_summer";
		s1.concat(" is here");
		s2.concat(s1);
		s1 += "_summer";
		// how many String objects and reference variables were created?
		System.out.println(s1 + " = " + s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
