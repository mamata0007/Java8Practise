package Java8_Program;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class FrequencyofString {

	public static void main(String[] args) {
List<String> s=Arrays.asList("java", "is","a", "great", "language","java","java");
Map<String,Long> results=s.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(results);
	}

}
