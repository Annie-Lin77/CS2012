package ProgrammingExercises;

import java.util.Scanner;

public class floatinput {
	public static int Square(int num) {
		return num * num;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a float:");
		float a = input.nextFloat();
		float square = a* a;
			System.out.println("The squared float is:" + square);

	}

}
