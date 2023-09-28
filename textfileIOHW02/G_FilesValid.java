package textfileIOHW02;
import java.io.*;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 

public class G_FilesValid {

	public static void main(String[] args) {
		
		String z = "numberRow.txt";
		String y = "numbersColumn.txt";
		String x = "numberGrid.txt";
		String q = "gridStats.txt";
		String w = "randomPeople.txt";
		String p = "namesList.txt";

		File a = new File(z);
		File b = new File(y);
		File c = new File(q);
		File d = new File(q);
		File e = new File(w);
		File f = new File(p);
		
		if(a.exists()) {
			System.out.println(a);
		}else {
			System.out.println("missing" + a);
		}
		
		if(b.exists()) {
			System.out.println(b);
		}else {
			System.out.println("missing" + b);
		}
		
		if(c.exists()) {
			System.out.println(c);
		}else {
			System.out.println("missing" + c);
		}
		
		if(d.exists()) {
			System.out.println(d);
		}else {
			System.out.println("missing" + d);
		}
			
		if(e.exists()) {
			System.out.println(e);
		}else {
			System.out.println("missing" + e);
		}
		
		if(f.exists()) {
			System.out.println(f);
		}else {
			System.out.println("missing" + f);
		}
			
		while(a.exists() && b.exists() && c.exists() && d.exists() && e.exists() && d.exists()) {
			System.out.println("All complete: " + a + " " + b + " "+ c + " " + d + " " + e + " " + f);
			break;
		}
		
		}
		
	}
