package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class Sortedlist {

	public static void main(String[] args) {
List<Integer> nos=Arrays.asList(10,8,9,3,5,6,12,13,14,15);
nos.stream().sorted().forEach(System.out::println);

	}

}
