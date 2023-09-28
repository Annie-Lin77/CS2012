package textfileIOHW02;
import java.io.File;
import java.util.Scanner;

public class H_ReadFile {

	public static void main(String[] args) {
		
		try {
			Scanner file = new Scanner(new File("mindkiller.txt"));
			
			String line;
			int charcount=0;
			int wcount=0;
			int lcount=0;
			
			while(file.hasNextLine()){
				line = file.nextLine();
				lcount++;
			String[] words = line.split(" ");
			wcount += words.length;
			for(String token:words){
				charcount +=token.length();
				}
			}
			
			System.out.println("Name of the input file:" + file);
			System.out.println("Number of lines in the file:"+lcount);
			System.out.println("Number of words in a file:"+wcount);
			System.out.println("Number of characters in a file:"+charcount);

			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	}