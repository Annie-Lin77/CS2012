package customStringHW;

public class StringTest {
	
	public static void main(String[] args) {
		
		//constructor and to string 
		char data [] = { 'J', 'a', 'v', 'a'};
		CustomString str = new CustomString(data);
		System.out.println("Custom string: " + str.toString());
		
		//change case
		CustomString str2 = str.changeCase();
		System.out.println("Change case: " + str2.toString());
		
		//charAt
		char a = str.charAt(2);
		System.out.println("Print character at 2: " + a);
		
		//compare to
		CustomString str3 = new CustomString(new char[] {'E', 'j', 'i', 'k', 'w', 'q', 'p'});
		int c = str.compareTo(str3);
		System.out.println("Compare custom string: " + c);
		
		//concat
		CustomString str4 = str.concat(str3);
		System.out.println("Concat 'Ejikwqp' with custom string: " + str4.toString());
		
		//equals
		boolean equals = str.equals(str3);
		System.out.println("Equals: " + equals);
		
		//length
		int length = str.length();
		System.out.println("Length of custom string: " + length);
		
		//split
		CustomString [] arr = str.split('a');
		for(CustomString s : arr) {
			System.out.print("Split at 'a': ");
			System.out.println(s.toString());
		}
		
		//substring
		CustomString str5 = str.substring(1);
		System.out.println("Substring: " + str5.toString());
		
		//title size- test with "java" string
		CustomString str6 = str.titleize();
		System.out.println("Title size: " + str6.toString());
		
		//to lower case
		CustomString str7 = str6.toLowerCase();
		System.out.println("Lower case: " + str7.toString());
		
		//to upper case
		CustomString str8 = str7.toUpperCase();
		System.out.println("Upper case: " + str8.toString());
	}

}
