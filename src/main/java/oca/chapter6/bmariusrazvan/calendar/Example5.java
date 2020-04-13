import java.time.Period;
import java.time.Year;

public class Example5 {
    public static void main(String[] args)
    {
        // create a Year object
        Year year = Year.of(2019);

        // print instance
        System.out.println("Year :"
                + year);

        // create temporalAmount object from period class
        // passing temporalAmount to
        // plus() method
        Year value
                = year.plus(
                Period.ofYears(12));

        // print result
        System.out.println("Value after addition: "
                + value);
    }
}
