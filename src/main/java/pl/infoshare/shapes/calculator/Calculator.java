package pl.infoshare.shapes.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double podziel(double a, double b) {
        if (b==0) return 0;
        return a / b;
    }
}
