package easy.HowManyNumbersAreSmallerThanTheCurrentNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallerNumbersThanCurrentTest {
    SmallerNumbersThanCurrent obj;

    @Test
    public void simpleTest() {
        obj = new SmallerNumbersThanCurrent();
        assertArrayEquals(new int[]{2,1,0,3}, obj.smallerNumbersThanCurrent(new int[]{6,5,4,8}));
    }

    @Test
    public void simpleTest2() {
        obj = new SmallerNumbersThanCurrent();
        assertArrayEquals(new int[]{0,0,0,0}, obj.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }

}
