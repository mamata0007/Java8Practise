package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secondlargest {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(3,5,7,8,9,10);
Optional<Integer> results=no.stream()
						.sorted(Comparator.reverseOrder())
						.skip(1)
						.findFirst();
 results.ifPresent(System.out::println);

	}

}
