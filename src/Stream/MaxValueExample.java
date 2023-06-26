package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class MaxValueExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 5, 8);

        Optional<Integer> maxValue = numbers.stream().max(Comparator.naturalOrder());

        if (maxValue.isPresent()) {
            System.out.println("Maximum value: " + maxValue.get()); 
        } 
        else {
            System.out.println("List is empty.");
        }
        
 //...................................................................................      
        
        if (numbers.size() >= 2) {
			int secondMaxValue = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(NoSuchElementException::new);

			System.out.println("Second maximum value: " + secondMaxValue);
		} else {
			System.out.println("Insufficient elements in the list.");
		}
        
 //........................................................................................
        
        if (numbers.size() >= 2) {
			int thirdMaxValue = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow(NoSuchElementException::new);

			System.out.println("third maximum value: " + thirdMaxValue);
		} else {
			System.out.println("Insufficient elements in the list.");
		}
        
        
 //.......................................................................
        
        List<Integer> num = Arrays.asList(3, 9, 2, 5, 8,9);

        Optional<Integer> minValue = num.stream().min(Comparator.naturalOrder());

        if (minValue.isPresent()) {
            System.out.println("Minmum value: " + minValue.get()); 
        } 
        else {
            System.out.println("List is empty.");
        }
    }
}

