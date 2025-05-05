package Java8_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {

	public static void main(String[] args) {
List<Integer> nos=Arrays.asList(9,8,10,11,12,3,45,67);
nos.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
