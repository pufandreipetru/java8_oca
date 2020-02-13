package oca.chapter1.encapsulation;

public class VATCalculatorTest {
    public static void main(String[] args) {
        calculateTotal(new VATCalculatorGeneral(66), 66);
        calculateTotal(new VATCalculatorFood(66), 66);
    }

    private static void calculateTotal(VATCalculator vatCalculator, float price) {

        double vat = vatCalculator.calculateVAT();

        System.out.println(price + vat);
    }

}
