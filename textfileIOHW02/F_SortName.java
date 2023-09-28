package textfileIOHW02;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class F_SortName {
	    
	    public static void main(String[] args) {
	       
	    	try {
	        Scanner input = new Scanner(new File("randomPeople.txt"));

	        String [] names = new String[1000];
	        int index = 0;
	        while(input.hasNext()) {
	        	names [index] =input.nextLine();
	        	index++;
	        	
	        }
	        
	        Arrays.sort(names);

	        String [] temp = new String[names.length];
	        int tempIndex = 0;
	        for(int i = 0; i < names.length - 1; i++) {
	        	if(!names[i].equals(names[i+1])) {
	        		temp[tempIndex] = names[i];
	        		tempIndex++;
	        	}
	        }
	      
	        String[] newArr = new String[tempIndex];
	        for(int i = 0; i < newArr.length; i++) {
	        	newArr[i] = temp[i];
	        }
	        
	        PrintWriter prtout = new PrintWriter("namesList.txt");
	        
	        Arrays.sort(names);
	        
	        for (int i = 0; i < 10; i++) {
	            prtout.println(names[i]);
	        }
	   
	        prtout.close();
	    } catch(Exception e) {
	    	System.out.println(e);
	    }
	}
	}

