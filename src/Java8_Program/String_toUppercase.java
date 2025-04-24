package Java8_Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert list string to uppercase
public class String_toUppercase {

	public static void main(String[] args) {
List<String> no=Arrays.asList("Mama","sahoo","java");
List<String> results=no.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
System.out.println(results);
	}

}
