package easy.SubtractProductAndSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractProductAndSumTest {
    SubtractProductAndSum obj;

    @Test
    public void simpleTest() {
        obj = new SubtractProductAndSum();
        assertEquals(15, obj.subtractProductAndSum(234));
    }

    @Test
    public void simpleTest2() {
        obj = new SubtractProductAndSum();
        assertEquals(21, obj.subtractProductAndSum(4421));
    }
}
