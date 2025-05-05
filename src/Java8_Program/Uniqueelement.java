package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class Uniqueelement {

	public static void main(String[] args) {
List<Integer> nos=Arrays.asList(4,4,4,5,6,1,2,3,4,5,3,6);
nos.stream().distinct().forEach(System.out::println);
	}

}
