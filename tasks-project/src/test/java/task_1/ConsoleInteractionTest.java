package task_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class ConsoleInteractionTest {
    private static ConsoleInteraction interaction;

    @BeforeAll
    public static void setUp() {
        interaction = new ConsoleInteraction();
    }

    void provideInput(byte[] data) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        System.setIn(inputStream);
    }

    @Test
    void inputValueFromConsole_insertValidData_Ok() {
        String s = "12+2";
        provideInput(s.getBytes());
        double [] array = {12, 2};
        assertArrayEquals(array, interaction.inputValueFromConsole());
    }

    @Test
    void inputValueFromConsole_insertNotNumericValues_NotOk() {
        String s = "ee+pq";
        provideInput(s.getBytes());
        assertThrows(RuntimeException.class, () -> interaction.inputValueFromConsole());
    }

    @Test
    void inputValueFromConsole_emptyString_NotOk() {
        String s = "";
        provideInput(s.getBytes());
        assertThrows(RuntimeException.class, () -> interaction.inputValueFromConsole());
    }

    @Test
    void inputValueFromConsole_notValidSign_NotOk() {
        String s = "12-2";
        provideInput(s.getBytes());
        assertThrows(RuntimeException.class, () -> interaction.inputValueFromConsole());
    }

    @Test
    void inputValueFromConsole_nullValue_NotOk() {
        String s = null;
        try {
            provideInput(s.getBytes());
        } catch (RuntimeException e) {
            return;
        }
        fail("RuntimeException should be thrown if value is null");
    }
}