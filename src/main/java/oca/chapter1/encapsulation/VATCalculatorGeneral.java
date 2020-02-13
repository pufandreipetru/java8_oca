package oca.chapter1.encapsulation;

public class VATCalculatorGeneral implements VATCalculator {
    private float money;
    private static final float PERCENTAGE = 0.24f;

    public VATCalculatorGeneral(float money) {
        this.money = money;
    }

    public double calculateVAT() {
        return PERCENTAGE * money;
    }
}