package conditional;

public class Example1 {
    public static void main(String[] args) {
        int maxNrOfRetries = 9;
        String status = maxNrOfRetries < 10 ? "Keep on doing it!" : "Stop!";
        System.out.println("Status is: " + status);
    }
}
