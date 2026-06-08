package StreamApi;

import java.util.Arrays;
import java.util.List;

public class ForeachLoop {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 6, 32, 64, 23, 443, 54);

        nums.forEach(n -> System.out.println(n));
    }
}
