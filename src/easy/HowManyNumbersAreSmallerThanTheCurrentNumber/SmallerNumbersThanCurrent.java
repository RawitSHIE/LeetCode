package easy.HowManyNumbersAreSmallerThanTheCurrentNumber;
//1365. How Many Numbers Are Smaller Than the Current Number
import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        return Arrays.stream(nums).map(i -> (int) Arrays.stream(nums).filter(j -> j < i).count()).toArray();
    }
}
