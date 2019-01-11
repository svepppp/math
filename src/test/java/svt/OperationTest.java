package svt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void testAdd() {
        String number1 = "4";
        String number2 = "5";
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);
        assertEquals(9, result);
    }

    @Test
    public void testSubtraction() {
        String number1 = "9";
        String number2 = "5";
        int result = Integer.parseInt(number1) - Integer.parseInt(number2);
        assertEquals(4, result);
    }
}
