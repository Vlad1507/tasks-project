package task_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
class CalculationTest {
    private static Calculation calculation;

    @BeforeAll
    public static void setUp() {
        calculation = new Calculation();
    }

    @Test
    void calculate_positiveNumbers_Ok() {
        double result = calculation.calculate(12, 4.2);
        double expected = 16.2;
        assertEquals(expected, result);
    }

    @Test
    void calculate_negativeNumbers_Ok() {
        double result = calculation.calculate(-12, -7);
        double expected = -19;
        assertEquals(expected, Double.parseDouble(String.format("%.2f", result)));
    }

    @Test
    void calculate_zeroValue_Ok() {
        double result = calculation.calculate(0, 0);
        double expected = 0;
        assertEquals(expected, result);
    }

//    @Test
//    void calculate_emptyArray_Ok() {
//        double result = calculation.calculate(0, 0);
//        double expected = 0;
//        assertEquals(expected, result);
//    }
}