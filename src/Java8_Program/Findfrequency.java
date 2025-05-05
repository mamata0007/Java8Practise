package Java8_Program;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Findfrequency {

	public static void main(String[] args) {
String s="java is a concept of the day";
Map<Character,Long> results=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(results);
	}

}
