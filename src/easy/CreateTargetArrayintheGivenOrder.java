package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        return target.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        CreateTargetArrayintheGivenOrder obj = new CreateTargetArrayintheGivenOrder();
        System.out.println(Arrays.toString(obj.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }
}
