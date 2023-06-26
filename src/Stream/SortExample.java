package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Germany", "Japan", "France", "USA", "China");

        List<String> sortedCountries = countries.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedCountries);
        
//................................................................................   
        
        List<Integer> nums =Arrays.asList(1,4,5,2,9,5,6);
        
        List<Integer> sortedNumbers=nums.stream().sorted().collect(Collectors.toList());
        
        List<Integer> sortedReverseNumbers=nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        System.out.println(sortedNumbers);
        System.out.println(sortedReverseNumbers);
    }
}

