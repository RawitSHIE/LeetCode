package easy.FindNumbersWithEvenNumberOfDigits;

import java.util.Arrays;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).filter(i -> String.valueOf(i).length() % 2 == 0).count();
    }
}
