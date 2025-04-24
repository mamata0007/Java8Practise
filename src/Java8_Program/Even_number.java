package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Even_number {

	public static void main(String[] args) {
//int[] a= {4,6,8,1,4,3,5,8,10};
List<Integer> evenno=Arrays.asList(4,6,8,1,4,3,5,8,10);
evenno.stream().filter(n->n%2==0).distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

}
