package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> freq = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                freq.add(nums[i+1]);
            }
        }

        return freq.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        DecompressRLElist obj = new DecompressRLElist();
        System.out.println(Arrays.toString(obj.decompressRLElist(new int[]{1, 1, 2, 3})));
    }
}
