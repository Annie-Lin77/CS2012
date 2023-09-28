package arraylistsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class arraylist1 {
	
	public static void main(String[] args) {
		
		String[] array = {"the", "bird", "car", "country", "do", "something", "ask", "thing", "movie", "ya", "thingy"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		
		Collections.sort(list);
		System.out.println(list);
	}

}
