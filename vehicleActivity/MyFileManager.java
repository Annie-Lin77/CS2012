package vehicleActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileManager {
	
	public static void clearFile(String fileName) throws FileNotFoundException {
		
		PrintWriter write = new PrintWriter(fileName);
		write.print(" ");
		write.close();
		
	}
	
	public static void appendLine(String lineToPrint, String fileName) {
		
		File f = new File(fileName);
		if(f.exists()&& !f.isDirectory()) {
		PrintWriter write;
		try {
			write = new PrintWriter(fileName);
			write.print(" ");
			write.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		}
	}
	
	public static void appendArray(ArrayList<Vehicle> v, String fileName) throws IOException {
		
		File aFile = new File(fileName);
		PrintWriter prtout = new PrintWriter(aFile);
		ArrayList<Vehicle> v1 = new ArrayList<>();
		prtout.print(v1);
		prtout.close();
		
	}
}
