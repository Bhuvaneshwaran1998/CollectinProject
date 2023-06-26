package Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseIndiaPlayer {
	public static void main(String[] args) {
		Players p1 = new Players("India", "Dhoni", 49, 35, 7);
		Players p2 = new Players("India", "Kolhi", 51, 31, 10);
		Players p3 = new Players("India", "Jattu", 33, 46, 45);
		Players p4 = new Players("India", "Bumra", 30, 29, 5);
		Players p5 = new Players("India", "yuvaraj", 35, 50, 12);

		HashMap<Integer, Players> players = new HashMap<>();
		players.put(p1.getJersey_No(), p1);
		players.put(p2.getJersey_No(), p2);
		players.put(p3.getJersey_No(), p3);
		players.put(p4.getJersey_No(), p4);
		players.put(p5.getJersey_No(), p5);

		players.values().stream().filter(x -> x.getAge() > 30).forEach(x -> System.out.println(x));

//Using values
		List<Players> n = players.values().stream().filter(x -> x.getAge() < 35).collect(Collectors.toList());
		for (Players i : n) {
			System.out.println(i);
		}

// using keySet()
		System.out.println("***************");
		List<Players> a = players.keySet().stream().filter(x -> players.get(x).getAge() > 35).map(x -> players.get(x))
				.collect(Collectors.toList());
		System.out.println(a);

		Map<Integer, Players> v = players.values().stream().filter(x -> x.getAge() > 30)
				.collect(Collectors.toMap(x -> x.getJersey_No(), y -> y));
		v.forEach((x, y) -> System.out.println(y));
	}
}
