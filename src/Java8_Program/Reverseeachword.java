package Java8_Program;

import java.util.Arrays;

import java.util.stream.Collectors;

public class Reverseeachword {

	public static void main(String[] args) {
String s="Java is best language";
String results=Arrays.stream(s.split(" "))
.map(word->new StringBuilder(word).reverse().toString())
.collect(Collectors.joining(" "));
System.out.println(results);

	}

}
