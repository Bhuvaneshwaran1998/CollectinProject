package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Michael", "Alice");

		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upperCaseNames);
		
	}
}
