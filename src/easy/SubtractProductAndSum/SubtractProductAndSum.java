package easy.SubtractProductAndSum;


public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int[] result = new int[]{0, 1};
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            String s = String.valueOf(num.charAt(i));
            result[0] += Integer.parseInt(s);
            result[1] *= Integer.parseInt(s);
        }

        return result[1] - result[0];
    }
}
