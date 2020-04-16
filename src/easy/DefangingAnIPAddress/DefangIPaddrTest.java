package easy.DefangingAnIPAddress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangIPaddrTest {
    DefangIPaddr obj;

    @Test
    public void simpleTest() {
        obj = new DefangIPaddr();
        assertEquals("1[.]1[.]1[.]1", obj.defangIPaddr("1.1.1.1"));
    }

    @Test
    public void simpleTest2() {
        obj = new DefangIPaddr();
        assertEquals("255[.]100[.]50[.]0", obj.defangIPaddr("255.100.50.0"));
    }
}
