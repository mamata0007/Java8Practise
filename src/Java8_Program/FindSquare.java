package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class FindSquare {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(2,3,4,5,9,10,5,7,12,6);
List<Integer> results=no.stream().filter(n->n%2==0)
.limit(3)
.map(n->n*n).toList();
System.out.println(results);

	}

}
