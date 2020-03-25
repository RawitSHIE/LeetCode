package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return (int) lst.stream().filter(i -> Integer.toString(i).length() % 2 == 0).count();
    }

    public static void main(String[] args) {
        FindNumbers findNumbers = new FindNumbers();
        System.out.println(findNumbers.findNumbers(new int[]{12,345,2,6,7896}));
    }
}
