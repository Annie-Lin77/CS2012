package exceptionEx;

import java.util.Scanner;

public class Exception3 {
	
	public static void main(String[] args) {

        int[] randomArray= new int[100];

        for(int i= 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(1 + Math.random() * 100);
        }

        Scanner input= new Scanner(System.in);

        System.out.println("Enter an index in the array to display it's value: ");

        try{
            int indexValue= input.nextInt();
            System.out.println(randomArray[indexValue]);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds");
        }

        input.close();
    }
}
