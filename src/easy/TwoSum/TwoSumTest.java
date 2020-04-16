package easy.TwoSum;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    TwoSum obj;

    @Test
    public void simpleTest() {
        obj = new TwoSum();
        assertArrayEquals(new int[]{1, 0}, obj.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
