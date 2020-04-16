package easy.CreateTargetArrayIntheGivenOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateTargetArrayintheGivenOrderTest {
    CreateTargetArrayintheGivenOrder obj;
    @Test
    public void simpleTest() {
        obj = new CreateTargetArrayintheGivenOrder();
        assertArrayEquals(new int[]{0,4,1,3,2}
                ,obj.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }

    @Test
    public void simplleTest2() {
        obj = new CreateTargetArrayintheGivenOrder();
        assertArrayEquals(new int[]{0,1,2,3,4}
            , obj.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }
}
