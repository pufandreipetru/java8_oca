package overload;

public class Example4 {
    public static void main(String[] args) {
        Example4 main = new Example4();
        System.out.println(main.overloadedMethod(100));
        //What happens?
    }

    double overloadedMethod(double d) {
        return d *= d;
    }

    int overloadedMethod(int i) {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f) {
        return overloadedMethod(f *= f);
    }
}
