package overload;

public class Example5 {
    public static void main (String[] args) {
        main(1);
    }
    static void main(int i) {
        System.out.println("overloaded main");
    }
    //Will this work?
}
