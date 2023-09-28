package textfileIOHW02;
import java.io.File;
import java.util.Scanner; 
import java.io.PrintWriter;


public class D_WriteStats {
	
	public static void main(String[] args) {
		
		try {
			PrintWriter prtout = new PrintWriter("gridStats.txt");

			Scanner input = new Scanner(new File("numberGrid.txt"));
		
			int[][] arr = new int[10][10];
			for(int i= 0; i < 10; i++) {
				String [] row = input.nextLine().split(" ");
				for(int j = 0; j < 10; j++)
					arr[i][j] = Integer.parseInt(row[j]);
				}
			
			
			int grandtotal = 0;
			for (int i = 0; i < 10; i++) 
				for(int j = 0; j < 10; j++)
					grandtotal += arr[i][j];
			prtout.println("grand total: " + grandtotal);
			
			
			int[] totalrow = new int[10];
			int [] totalcol = new int[10];
			for (int i = 0; i < 10; i++) 
				for(int j = 0; j < 10; j++) {
					totalrow[i] += arr[i][j];
					totalcol[j] += arr[i][j];
				}
			for(int i = 0; i < 10; i++)
				prtout.println("total by row: " + totalrow[i] + " ");
			for(int j = 0; j < 10; j++)
				prtout.println("total by column: " + totalrow[j] + " ");
			
			
			double average = grandtotal/100.0;
			prtout.println("average value of all numbers: " + average);
			
			int count = 0;
			for(int i = 0; i < 10; i++)
				for(int j = 0; j < 10; j++)
					if(arr[i][j] == 17)
						count++;
			prtout.println("the count of how many times 17 is in the list: " + count);
			
			input.close();
			prtout.flush();
			prtout.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	}
