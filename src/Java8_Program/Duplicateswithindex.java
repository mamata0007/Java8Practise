package Java8_Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicateswithindex {

	public static void main(String[] args) {
List<Integer> no=Arrays.asList(2,5,7,8,9,2,1,7,8,9,10);
Set<Integer> set=new HashSet();
List<Integer> results=no.stream().filter(n->!set.add(n)).collect(Collectors.toList());
System.out.println(results);
	}

}
