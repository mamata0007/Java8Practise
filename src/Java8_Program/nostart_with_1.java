package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class nostart_with_1 {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(2,3,4,1,5,6,7,10,11,13,14);
no.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

	}

}
