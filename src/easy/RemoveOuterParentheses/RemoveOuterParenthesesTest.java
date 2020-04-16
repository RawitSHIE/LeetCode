package easy.RemoveOuterParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveOuterParenthesesTest {
    RemoveOuterParentheses obj;

    @Test
    public void SimpleTest1() {
        obj = new RemoveOuterParentheses();
        Assertions.assertEquals("()()()", obj.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void SimpleTest2() {
        obj = new RemoveOuterParentheses();
        Assertions.assertEquals("()()()()(())", obj.removeOuterParentheses("(()())(())(()(()))"));
    }
}
