package override;

class X1 {
    void methodOfX() {
        System.out.println("Class X");
    }
}

class Y1 extends X1 {
    @Override
    protected void methodOfX() {
        System.out.println("Class Y");
    }
}

class Z1 extends Y1 {
    @Override
    public void methodOfX() {
        System.out.println("Class Z");
    }
}

public class Example5 {
    public static void main (String[] args) {
        Z1 z = new Z1();
        z.methodOfX();
        //Is this correct?
    }
}
