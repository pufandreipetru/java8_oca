package oca.chapter3.andrei_puf.gc;

import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.*;

public class FileWrite {

	private FileWriter fw;

	public static void main(String... args) throws IOException {
		FileWrite fileWrite = new FileWrite();
		fileWrite.writeSomethingToFile();
		fileWrite = null;
		gc();
	}
	
	private void writeSomethingToFile() throws IOException {
		this.fw = new FileWriter("test.txt");
		this.fw.write("Creating a dummy file content.");
	}

	@Override
	protected void finalize() throws Throwable {
		out.println("Closing the file...");
		this.fw.close();
	}

}
