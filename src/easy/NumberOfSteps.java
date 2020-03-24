package easy;
//Number of Steps to Reduce a Number to Zero
public class NumberOfSteps {
    public int numberOfSteps (int num) {
        int round = 0;
        while (num != 0) {
           if  (num % 2 == 0)
               num /= 2;
           else
               num -= 1;
           round ++;
        }

        return round;
    }

    public static void main(String[] args) {
        NumberOfSteps obj = new NumberOfSteps();
        System.out.println(obj.numberOfSteps(14));
    }
}
