package src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {

	public static void main(String[] args) {
		
		String pattern = ("([\\u0410-\\u044f\\u04E8\\u04E9\\u04AE\\u04AF\\u0401\\u0451]{2})[0-9]{2}(0[1-9]|[12][0-9]|3[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{2}");

		
		System.out.println("Регистрийн дугаараа оруул:");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		
		if(input.matches(pattern)){
			System.out.println("Оруулсан Регистр зөв байна.");
		} else{
			System.out.println("Оруулсан Регистр буруу байна.");
		}
	}
}
