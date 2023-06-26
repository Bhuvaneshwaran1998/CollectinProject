package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple");

        List<String> filteredFruits = fruits.stream().filter(fruit -> fruit.length() > 5).collect(Collectors.toList());

        System.out.println(filteredFruits); 
        
    }
}

