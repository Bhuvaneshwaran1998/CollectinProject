package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class SecondMaxValueExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 9, 2, 5,8);

		if (numbers.size() >= 2) {
			int secondMaxValue = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(NoSuchElementException::new);

			System.out.println("Second maximum value: " + secondMaxValue);
		} else {
			System.out.println("Insufficient elements in the list.");
		}
		
		if (numbers.size() >= 3) {
			int thirdMaxValue = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow(NoSuchElementException::new);

			System.out.println("third maximum value: " + thirdMaxValue);
		} else {
			System.out.println("Insufficient elements in the list.");
		}
	}
}
