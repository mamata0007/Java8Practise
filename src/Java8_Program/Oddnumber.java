package Java8_Program;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Oddnumber {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(1, 3, 4, 8, 2, 3, 4, 9, 10);
        no.stream()
          .filter(n -> n % 2 != 0)
          .distinct()
          .sorted(Comparator.naturalOrder())
          .forEach(System.out::println);
    }
}









