package Java8_Program;

public class Sumofalldigits {

	public static void main(String[] args) {
String s="123456";
System.out.println(String.valueOf(s).chars().map(Character::getNumericValue)
.sum());

	}

}
