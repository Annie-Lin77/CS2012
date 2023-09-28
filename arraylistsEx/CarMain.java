package arraylistsEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("From which file do you want to load this information: ");
		String pathstring = scan.nextLine();
		
		try {
			 BufferedReader bufReader = new BufferedReader(new FileReader(pathstring + ".txt"));
			    ArrayList<String> cars = new ArrayList<>();

			    String line = bufReader.readLine();
			    while (line != null) {
			      cars.add(line);
			      line = bufReader.readLine();
			      
			    }
			    
			    bufReader.close();
			    Collections.sort(cars);
			    System.out.println(cars.toString());
			    }
			
			
		catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
