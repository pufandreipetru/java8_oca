package oca.chapter5.andrei_puf.loops;

import static java.lang.System.out;

public class DoWhileLoops {
    public static void main(String... args) {
        do {
            out.println(" Do While");
        } while (true);

        do {
            out.println("Do While");
        } while (false);

        int x = 5;
        do {
            out.println("Do While");
        } while (x = 5);
    }
}
