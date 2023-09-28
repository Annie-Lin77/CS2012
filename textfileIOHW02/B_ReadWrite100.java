package textfileIOHW02;
import java.io.File;
import java.util.Scanner; 
import java.io.PrintWriter;

public class B_ReadWrite100 {

	public static void main(String[] args) {
				
		try {
			PrintWriter prtout = new PrintWriter("numbersColumn.txt");

			Scanner input = new Scanner(new File("numberRow.txt"));
		
			while(input.hasNextInt()) {
				int i = input.nextInt();
				prtout.println(i);
			}
				
			input.close();
			prtout.flush();
			prtout.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
