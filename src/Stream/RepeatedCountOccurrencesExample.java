package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCountOccurrencesExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 3, 2, 4, 5, 4, 6);

        Map<Integer, Long> counts = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println("Number\tCount");
        counts.forEach((number, count) -> System.out.println(number + "\t" + count));
    }
}

