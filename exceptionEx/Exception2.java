package exceptionEx;
import java.util.*;

public class Exception2 {
	
	public static void main(String[] args) {
		
       Scanner input = new Scanner(System.in);
    
        while(true) {
            System.out.print("Please enter in 2 integers to get their sum: ");        
            try{
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.printf("The sum is: " + (a + b));
                break;
            }catch(InputMismatchException a) {
               System.out.printf("You must enter 2 integers");
               input.nextLine(); 
            }
            
        } 
        
    }


}
