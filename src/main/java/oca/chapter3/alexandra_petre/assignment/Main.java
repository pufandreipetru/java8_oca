package oca.chapter3.alexandra_petre.assignment;

public class Main {
    public static void main(String[] args) {
        int y = 10;
        int x = 20;

        y -= 6;
        System.out.println("y = " + y);

        x += 4 * 10;
        System.out.println("x = " + x);

        int a = 23;
        a %= 2;
        System.out.println("a = " + a);

        a = -2;
        a = -a;
        System.out.println("a=" + a);

        int s = 10;
        s += s--;
        System.out.println("s = " + s);
    }
}
