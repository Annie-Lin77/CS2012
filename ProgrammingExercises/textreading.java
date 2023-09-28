package ProgrammingExercises;

import java.io.File;
import java.util.Scanner;

public class textreading {

	public static void main(String[] args) {
		File file = new File("textFilefor5.txt");
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter amount of integers in file:");
			int a = input.nextInt();
		
			double[] array = new double [a];
			double sum = 0;
		
			for(int i = 0; i < array.length; i++) {
				System.out.println("Enter number:" + (i+1));
				array[i] = input.nextDouble();
				}
			input.close();
		
			for(int i = 0; i < array.length; i++) {
				sum = sum + array[i];
				}
			double average = sum/a;
			System.out.format("The average is:", average);
		
			int s = 0;
			System.out.println("Enter number:");
			int n = input.nextInt();
			for (int i = 0; i < n; i++) {
				s = s +i;
			}
			System.out.println("Sum of numbers:" + s);
			System.out.println("The origional column of numbers:" + array);
		}
	 catch(Exception e) {
		 System.err.println(e);
	}
	}
}
