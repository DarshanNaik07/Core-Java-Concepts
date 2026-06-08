package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 6, 32, 64, 23, 443, 54);

        Stream<Integer> evenNumbers = nums.stream();
        Stream<Integer> s1 = evenNumbers.filter(n -> n%2==0);
        Stream<Integer> s2 = s1.map(n -> n*2);

        s2.forEach(n -> System.out.println(n));
    }
}