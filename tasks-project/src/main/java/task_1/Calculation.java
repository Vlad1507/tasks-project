package task_1;

import java.util.Arrays;

public class Calculation {

    private double firstValue;
    private double secondValue;

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double calculate(double a, double b) {
        return a + b;
    }
}
