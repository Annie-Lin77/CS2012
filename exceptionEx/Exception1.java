package exceptionEx;

public class Exception1 {
	
	public static void main(String[] args) {
        int result= 0;

        switch(args[1].charAt(0)) {
            case'+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case'-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case'.':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case'/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
        }
        
        System.out.println(args[0] + ' '+ args[1] + ' '+ args[2] + " = " + result);
    }

	void checkInput(String[] args) {
		try{
			Integer.parseInt(args[0]);
		} 
		catch(NumberFormatException e) {

        System.out.println("Invalid Input: "+ args[0]);
        System.exit(1);

		}
    
		try{
			Integer.parseInt(args[2]);
		} catch(NumberFormatException e) {

			System.out.println("Invalid Input: "+ args[2]);
			System.exit(2);
	}
}
}
