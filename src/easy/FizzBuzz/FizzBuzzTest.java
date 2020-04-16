package easy.FizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz obj;

    @Test
    public void simpleTest() {
        obj = new FizzBuzz();
        String[] strarr = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        List<String> lst = Arrays.stream(strarr).collect(Collectors.toList());
        assertEquals(lst ,obj.fizzBuzz(15));
    }

}
