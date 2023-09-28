package textfileIOHW02;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.PrintWriter;
import java.util.*;
import java.io.FileReader;

public class E_WriteName {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<String> fnames = new ArrayList<String>();
		Scanner input = new Scanner(new FileReader("firstNames.txt"));
		String fnamestr;
		while(input.hasNext()) {
			fnamestr = input.nextLine();
			fnames.add(fnamestr);
		}
		String[] array = (new String[0]);
		
		
		List<String> lnames = new ArrayList<String>();
		Scanner scan = new Scanner(new FileReader("lastNames.txt"));
		String lnamestr;
		while(input.hasNext()) {
			lnamestr = input.next();
			lnames.add(lnamestr);
		}
		String[] larray = (new String[0]);

		try {
			PrintWriter prtout = new PrintWriter("randomPeople.txt");

			Random random = new Random();
			
				while(input.hasNext());
					int firstnamess = 0;
				
				
					while(input.hasNext());
				int lastnamess = 0;
				
				for(int i = 0; i < 1000; i++) {
				prtout.println(firstnamess + " " +lastnamess);
				}
				
			input.close();
			scan.close();
			prtout.flush();
			prtout.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
