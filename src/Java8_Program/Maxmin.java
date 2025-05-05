package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class Maxmin {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(20,30,45,67,89,100,23);
		int max=no.stream()
					.mapToInt(Integer::intValue)
					.max()
					.getAsInt();
						System.out.println(max);


int min=no.stream().mapToInt(Integer::intValue).min().getAsInt();

System.out.println(min);

	}

}
