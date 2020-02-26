package oca.chapter2.andrei_puf.inheritance;

import java.lang.Cloneable;
import static java.lang.System.*;

public class ObjectInheritance implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectInheritance objinh1 = new ObjectInheritance();
		ObjectInheritance objinh2 = new ObjectInheritance();

		ObjectInheritance cloneObj = (ObjectInheritance)objinh1.clone();
		
		out.println("objinh1 == objinh2 " + objinh1.equals(objinh2));
		
		out.println("Hash code of :" + objinh1.hashCode());
		
		out.println("Hash code of :" + cloneObj.hashCode());
		
		out.println("cloneObj == objinh1 :" + (cloneObj==objinh1));
	}
	
	public boolean equals(Object obj) {
		return true;
	}
}
