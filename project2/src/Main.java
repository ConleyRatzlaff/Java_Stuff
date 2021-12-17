/*
 Conley Ratzlaff
 CIS 219
 Tu Th 3:30
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		
		System.out.println("Enter the month # you were born:");
		int month = scan.nextInt();
		
		if (month > 12) {
			System.out.println("Please enter a number between 1 - 12" );
			System.out.println("Enter the month # you were born:");
			month = scan.nextInt();
		}
		
		
		System.out.println("Enter the day you were born:");
		int day = scan.nextInt();
		
		System.out.println("Enter the year you were born:");
		int year = scan.nextInt();
	
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(year, month, day);
		
	
		int age = Period.between(birthDate, today).getYears();
		
		System.out.println("Todays date is: " + today);
		System.out.println("Your birthdate is: " + birthDate);
		System.out.println("That makes you: " + age);
		
		switch(month) {
		case 1:
			System.out.println("You were born in January and your birthstone is Garnet");
			break;
		case 2:
			System.out.println("You were born in February and your birthstone is Amethyst");
			break;
		case 3:
			System.out.println("You were born in March and your birthstone is Aquamarine");
			break;
		case 4:
			System.out.println("You were born in April and your birthstone is Diamond");
			break;
		case 5:
			System.out.println("You were born in May and your birthstone is Emerald");
			break;
		case 6:
			System.out.println("You were born in June and your birthstone is Pearl");
			break;
		case 7:
			System.out.println("You were born in July and your birthstone is Ruby");
			break;
		case 8:
			System.out.println("You were born in August and your birthstone is Sardonyx");
			break;
		case 9:
			System.out.println("You were born in September and your birthstone is Sapphire");
			break;
		case 10:
			System.out.println("You were born in October and your birthstone is Opal");
			break;
		case 11:
			System.out.println("You were born in November and your birthstone is Topaz");
			break;
		case 12:
			System.out.println("You were born in December and your birthstone is Turquoise");
			break;
		}
		
	}

}
