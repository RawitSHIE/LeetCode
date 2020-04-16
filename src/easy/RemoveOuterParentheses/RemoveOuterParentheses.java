package easy.RemoveOuterParentheses;

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder string = new StringBuilder();
        int parr = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && parr++ > 0) string.append(c);
            if (c == ')' && parr-- > 1) string.append(c);
        }

        return string.toString();
    }
}
