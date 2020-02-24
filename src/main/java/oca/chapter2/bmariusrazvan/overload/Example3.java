package overload;

public class Example3 {

    static int method(int i, double d) {
        return (int) (i + d);
    }

    static double method(double i, double d) {
        return i + d;
    }

    int method(int i, int d) {
        return i + d;
    }

    double method(double i, int d) {
        return i + d;
    }

    // Is correctly overloaded?
}
