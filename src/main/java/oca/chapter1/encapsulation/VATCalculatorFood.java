package oca.chapter1.encapsulation;

public class VATCalculatorFood implements VATCalculator {
    private float money;
    private static final float PERCENTAGE = 0.09f;
    public VATCalculatorFood(float money) {
        this.money = money;
    }
    @Override
    public double calculateVAT() {
        return PERCENTAGE * money;
    }
}
