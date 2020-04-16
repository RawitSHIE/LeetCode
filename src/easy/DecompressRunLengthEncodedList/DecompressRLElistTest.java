package easy.DecompressRunLengthEncodedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DecompressRLElistTest {
    DecompressRLElist obj;
    @Test
    public void simpleTest() {
        obj = new DecompressRLElist();
        assertArrayEquals(new int[]{2,4,4,4}, obj.decompressRLElist(new int[]{1,2,3,4}));
    }

    @Test
    public void simpleTest2() {
        obj = new DecompressRLElist();
        assertArrayEquals(new int[]{1,3,3}, obj.decompressRLElist(new int[]{1,1,2,3}));
    }
}
