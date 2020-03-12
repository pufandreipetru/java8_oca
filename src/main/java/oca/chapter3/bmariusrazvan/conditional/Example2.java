package conditional;

public class Example2 {
    public static void main(String[] args) {
        int maxNrOfRetries = 10;
        boolean isFlooding = true;
        String status = maxNrOfRetries < 10 ? "Keep on doing it!" : isFlooding ? "Stop!" : "Something went wrong!";
        System.out.println("Status is: " + status);
    }
}
