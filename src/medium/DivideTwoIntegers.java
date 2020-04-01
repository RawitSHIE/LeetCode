package medium;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long b = divisor > 0 ? (long) divisor : - (long) divisor;
        long a = dividend > 0 ? (long) dividend : - (long) dividend;

        int recur = recursive(a, b, 1);
        if (dividend < 0 && divisor < 0) return recur;
        if (dividend < 0 || divisor < 0) return -recur;
        return recur;
    }

    int recursive(long x, long y, int count) {
        System.out.println(x + ":" + y + ":" + count);
        if (x <= 0 || count == 0) return 0;
        if (y == 1) return (int) x;
        if (y > x) return recursive(x, y >>> 1, count >>> 1);
        return recursive(x-y, y*2, count*2) + count;
    }


    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        System.out.println(divideTwoIntegers.divide( 2147483647, 2));
    }
}
