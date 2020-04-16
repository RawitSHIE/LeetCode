package easy.DecompressRunLengthEncodedList;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                lst.add(nums[i+1]);
            }
        }

        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}
