package oca.chapter2.alexandra_petre.statics;

public class PlayWithMain {
    public static void main(String... args) {
        //what happens below
        main("Test");

        //what happens below
        //new PlayWithMain().main("Test1");

        //what happens below
        //main("Test1", "Test2");

        //what happens below
        //main();
    }

    public static void main(String arg) {
        System.out.println("I say " + arg);
    }
}
