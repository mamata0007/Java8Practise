package com.study;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Findfrequencyofeachchar extends Demo {

	public static void main(String[] args) {
String s="java is a language";
IntStream no=s.chars();
Map<Character,Long> results=no.mapToObj(c->(char)c)
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(results);
	}

}
