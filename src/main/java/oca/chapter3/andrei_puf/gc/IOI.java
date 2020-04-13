package oca.chapter3.andrei_puf.gc;

import static java.lang.System.*;

public class IOI {
    private IOI i;
    public static void main(String... args) throws InterruptedException {

        IOI i1 = new IOI();
        IOI i2 = new IOI();
        i1.i = i2;
        i2.i = i1;
	gc();
        Thread.sleep(5000);
	gc();
    }
    @Override
    protected void finalize() throws Throwable {
        out.println("Gc removed this object");
    }

}
