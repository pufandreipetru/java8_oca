package oca.chapter1.encapsulation;

public class VATCalculator {
    private float money;

    public VATCalculator(float money) {
        this.money = money;
    }

    public double calculateVAT() {
        return 0.24 * money;
    }
}