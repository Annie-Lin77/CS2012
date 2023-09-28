package ProgrammingExercises;

import java.util.Scanner;

public class intergerinput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean a = false;
		
		while(!a) {
			System.out.println("Enter an integer:");
			String b = input.next();
			 try {
			        int c = Integer.parseInt(b);
			        System.out.println("You entered the integer:" + c);
			        a = true;
			    } catch (NumberFormatException e) {
			        System.out.println("This is not an integer, try again:");
			    }
			}
			}
	}
