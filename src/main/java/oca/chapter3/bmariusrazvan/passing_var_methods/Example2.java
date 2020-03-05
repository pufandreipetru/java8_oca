package passing_var_methods;

public class Example2 {
    static String name = "Solaris Urbino 18m";

    static void changeIt(String name) {
        name = "Solaris Urbino Electric 12m";
        System.out.println("Name of bus is " + name);
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        System.out.println("Bus name is " + name);
        changeIt(name);
        System.out.println("Bus name after calling changeIt is " + name);
    }
}

// only the local name variable is modified, because the method has parameter named name
