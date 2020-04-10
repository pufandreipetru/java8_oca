package oca.chapter5.cristina_nan.handling_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestHierarchyExceptions {

	public static void main(String args[]) {
		try {
			File file = new File("test.txt");// Following file does not exist
			FileReader fr = new FileReader(file);
			fr.read();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException File does not exist");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
