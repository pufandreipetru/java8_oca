package oca.chapter1.automotive;

import static java.lang.System.*;
public interface Car {
	public void run();
	public default void makeNoise() { out.println("Making engine noise"); }
	
}
