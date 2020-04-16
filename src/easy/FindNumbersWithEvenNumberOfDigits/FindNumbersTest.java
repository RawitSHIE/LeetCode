package easy.FindNumbersWithEvenNumberOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumbersTest {
    FindNumbers obj;

    @Test
    public void simpleTest() {
        obj = new FindNumbers();
        assertEquals(2, obj.findNumbers(new int[]{12,345,2,6,7896}));
    }

    @Test
    public void simpleTest2() {
        obj = new FindNumbers();
        assertEquals(1, obj.findNumbers(new int[]{555,901,482,1771}));
    }
}
