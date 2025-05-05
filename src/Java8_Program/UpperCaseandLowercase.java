package Java8_Program;

import java.util.Arrays;
import java.util.List;

public class UpperCaseandLowercase {

	public static void main(String[] args) {
List<String> no=Arrays.asList("mama","Mama","krishna","SwAgAT","DhANa");
List<String> results=no.stream().map(String::toUpperCase).toList();
System.out.println(results);
List<String> results2=no.stream().map(String::toLowerCase).toList();
System.out.println(results2);

	}

}
