package easy.JewelsAndStones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumJewelsInStonesTest {
    NumJewelsInStones obj;

    @Test
    public void simpleTest(){
        obj = new NumJewelsInStones();
        assertEquals(2, obj.numJewelsInStones("a", "aa"));
    }

    @Test
    public void CapitalTest() {
        obj = new NumJewelsInStones();
        assertEquals(2, obj.numJewelsInStones("aA", "aAZZZZZ"));
    }
}
