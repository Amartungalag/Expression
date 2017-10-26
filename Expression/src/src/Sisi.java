package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sisi {

	public static void main(String[] args) {
		String pattern="([01][0-9]b1)(?:seas|sob|sas|law)[0-9]{4}";
		Pattern r=Pattern.compile(pattern);
		
		System.out.println("Оюутны ID-аа оруулна уу.");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if(input.matches(pattern)){
			System.out.println("Оруулсан ID зөв байна.");
		} else{
			System.out.println("Оруулсан ID буруу байна.");
		}
		
	}
}
