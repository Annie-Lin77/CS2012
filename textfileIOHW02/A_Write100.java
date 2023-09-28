package textfileIOHW02;

import java.io.File; 
import java.io.PrintWriter;

public class A_Write100 {

	public static void main(String[] args) {
		String pathString = "numberRow.txt" ;
		try {
			File aFile = new File(pathString);
			PrintWriter prtout = new PrintWriter(aFile);
			
			int max = 1000;
			int min = 0;
			int range = max - min + 1;
			
			for(int i= 0; i < 100; i++) {
				int a = (int)(Math.random()*range + min);
				prtout.print(a + " ");
			}
			
			prtout.flush();
			prtout.close();
			
		} catch (Exception e) {
			System.err.println("e");
		}

	}

}
