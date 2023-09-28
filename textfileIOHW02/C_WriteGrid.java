package textfileIOHW02;
import java.io.File;
import java.io.PrintWriter;

public class C_WriteGrid {

	public static void main(String[] args) {
		String pathString = "numberGrid.txt" ;
		try {
			File aFile = new File(pathString);
			PrintWriter prtout = new PrintWriter(aFile);
			
			int max = 20;
			int min = 0;
			int range = max - min + 1;
			
			
			for(int i= 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
				int a = (int)(Math.random()*range + min);
				prtout.print(a + " ");
			}
				prtout.println();
			}
			
			prtout.flush();
			prtout.close();
			
		} catch (Exception e) {
			System.err.println("e");
		}

	}
	}
