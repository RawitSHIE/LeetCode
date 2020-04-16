package easy.CreateTargetArrayIntheGivenOrder;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            lst.add(index[i], nums[i]);
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }


}
