package easy.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String num = "";
            if (i % 3 == 0) num += "Fizz";
            if (i % 5 == 0) num += "Buzz";

            if (num.length() == 0) num += String.valueOf(i);
            lst.add(num);
        }

        return lst;
    }
}
