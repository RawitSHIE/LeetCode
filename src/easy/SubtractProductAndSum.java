package easy;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        String numstr = Integer.toString(n);
        int mul = 1;
        int sum = 0;
        for (int i = 0; i < numstr.length(); i++) {
            int parseInt = Integer.parseInt(String.valueOf(numstr.charAt(i)));
            sum += parseInt;
            mul *= parseInt;
        }

        return mul - sum;
    }

    public static void main(String[] args) {
        SubtractProductAndSum obj = new SubtractProductAndSum();
        System.out.println(obj.subtractProductAndSum(234));
    }
}
