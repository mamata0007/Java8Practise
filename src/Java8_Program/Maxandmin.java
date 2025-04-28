package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Maxandmin {

	public static void main(String[] args) {
List<Integer> nos=Arrays.asList(3,4,5,6,10,11,23,45);
int max=nos.stream().max(Comparator.naturalOrder()).get();
int min=nos.stream().min(Comparator.naturalOrder()).get();
System.out.println(max);
System.out.println(min);


	}

}
