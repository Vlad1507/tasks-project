package task_1;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleInteraction {
    public double[] inputValueFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write an example for addition ");
        String value = input.nextLine();
        int count = 0;
        while (value.isEmpty()) {
            System.out.println("Insert value");
            value = input.nextLine();
            if (count == 5) {
                throw new RuntimeException("Enough sending an empty string");
            }
            count++;
        }
        if (value.chars().anyMatch(Character::isLetter)){
            throw new RuntimeException("Invalid data inserted");
        }

        if (value.chars().mapToObj(Character::toString).noneMatch(e -> e.equals("+"))) {
            throw new RuntimeException("Addition operator is not present");
        }

        input.close();
        return Arrays.stream(value.split("\\+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
