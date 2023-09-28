package arrayHW03;
import java.util.*;

public class arrayhw {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int col;
		int row;
		
		while(true) {
			System.out.print("Choose a number between 5 to 10 for the number of columns:");
			col = input.nextInt();
			
			System.out.print("Choose a number between 5 to 10 for the number of rows:");
			row = input.nextInt();
			
			if(col >= 5 && col <= 10 && row >=5 && row <=10) break;
			
			System.out.println("Enter the correct amount of rows and columns");
		}
		
		int array[][] = new int [row][col];
		System.out.println("Generating random int with " + col + "columns and " + row + "rows");
		
		Random random = new Random();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = random.nextInt(900) + 100;
			}
		}
		
		int total = 0;
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				total += array[i][j];
				System.out.print(array[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------");
		
		double avgerage = (total*1.0)/(col*row*1.0);
		int rings = (Math.min(col, row) + 1)/2;
		
		System.out.println("The number of rings in the array: " + rings);
		System.out.println("Sum of all array elments: " + total);
		System.out.println("Average of all array elements: " + avgerage);
		
		int outerelements = (2 * col + 2 * row -4);
		System.out.println("Number of elements in outer ring: " + outerelements);
		System.out.println("Outer ring of elements listed going counterclockwise: ");
		
		int ringsum = 0;
		
		for(int i = col -1; i >= 0; i--) {
			System.out.print(array[0][i] + " ");
			ringsum += array[0][i];
		}
		
		for(int i = 1; i < row; i++) {
			System.out.print(array[i][0] + " ");
			ringsum += array[i][0];
		}
		
		for(int i = 1; i < col; i++) {
			System.out.print(array[row - 1][i] + " ");
			ringsum += array[row - 1][i];
		}
		
		for(int i = row - 2; i > 0; i--) {
			System.out.print(array[i][col - 1] + " ");
			ringsum += array[i][col - 1];
		}
		
		System.out.println("Sum of outer ring elements: " + ringsum);
		System.out.println("Average of outer ring elements: " + (1.0 * ringsum)/outerelements);
		
	}

}
