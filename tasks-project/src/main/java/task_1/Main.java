package task_1;

public class Main {

    public static void main(String[] args) {
        ConsoleInteraction consoleInteraction = new ConsoleInteraction();
        double[] values = consoleInteraction.inputValueFromConsole();
        Calculation calculation = new Calculation();
        double result = calculation.calculate(values[0], values[1]);
        System.out.println(result);
    }
}
