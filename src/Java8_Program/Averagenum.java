package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class Averagenum {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(4,5,6);
double results=no.stream()
				.mapToInt(num->num.intValue())
				.average()
				.getAsDouble();
System.out.println(results);

	}

}
