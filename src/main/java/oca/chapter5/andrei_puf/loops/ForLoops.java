package oca.chapter5.andrei_puf.loops;

import static java.lang.System.out;

public class ForLoops {

    public static void main(String... args) {
        // for(initialization;condition;iteration) {}
        // break
        // continue
        // return
        // System.exit()

//        for (;;) {
//            out.println("For loop");
//        }

//        for (int i=1;i<3; i++) {
//
//        }

//        for(int i=1, j=1; i< 10 || j<12; i++,j+=3) {
//            out.print(i);
//            out.println(j);
//        }
        test:
        for(int i=1;i < 5; i++) {
            for (; true; ) {
                out.println("For loop");
                continue test;
            }
        }

//        test:
//        {
//            out.println("test");
//            if (true) {
//                break test;
//            }
//            out.println("test2");
//        }
//            out.println("test3");
    }
}
