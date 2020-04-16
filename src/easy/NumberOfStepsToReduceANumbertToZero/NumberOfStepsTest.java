package easy.NumberOfStepsToReduceANumbertToZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStepsTest {
    NumberOfSteps obj;

    @Test
    public void simpleTest() {
        obj = new NumberOfSteps();
        assertEquals(6, obj.numberOfSteps(14));
    }

    @Test
    public void simpleTest2() {
        obj = new NumberOfSteps();
        assertEquals(4, obj.numberOfSteps(8));
    }
}
