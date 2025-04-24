package Java8_Program;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_first_element_togreaterthan5 {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(3,4,5,6,10,6,7,9,12);
Optional<Integer> results=no.stream().filter(n->n>5)
.findFirst();
results.ifPresent(System.out::println);

	}

}
