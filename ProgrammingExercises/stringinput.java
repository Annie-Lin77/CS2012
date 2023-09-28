package ProgrammingExercises;

import java.util.Scanner;

public class stringinput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a String:");
		String first = input.next();
		System.out.println(first);
		
		System.out.println("Input an Integer:");
		int a = input.nextInt();
		System.out.println(a);
		
		System.out.println("Enter anything:");
		
		if (input.hasNextInt()) 
			System.out.println( "It is an integer.");
		
		else if (input.hasNextFloat()) 
			System.out.println("It is a float.");
		
		else if (input.hasNextLine()) 
			System.out.println("It is a string.");
		}
	}