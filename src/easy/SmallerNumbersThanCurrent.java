package easy;
//1365. How Many Numbers Are Smaller Than the Current Number
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return list.stream().map(num -> list.stream().filter(n -> n < num).count()).mapToInt(Math::toIntExact).toArray();
    }

    public static void main(String[] args) {
        SmallerNumbersThanCurrent obj = new SmallerNumbersThanCurrent();
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
}
