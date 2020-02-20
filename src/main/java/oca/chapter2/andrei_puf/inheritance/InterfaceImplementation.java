package oca.chapter2.andrei_puf.inheritance; 

import static java.lang.System.*;

interface MyGreatInterface {
	public static void printMyName() {
		out.println(MyInterface.class.getName());
	}
}

public class InterfaceImplementation implements MyGreatInterface {
	
	public static void main(String[] args) {

		MyGreatInterface.printMyName();

		InterfaceImplementation.printMyName();
	}
}
