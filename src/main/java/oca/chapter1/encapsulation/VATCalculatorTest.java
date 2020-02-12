package oca.chapter1.encapsulation;

public class VATCalculatorTest {
    public static void main(String[] args) {
        VATCalculator vatCalculator = new VATCalculator(66);
        double vat = vatCalculator.calculateVAT();
        System.out.println(vat);
    }
}
