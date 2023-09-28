package arraylistsEx;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> scentence = new ArrayList<String>();
		for(String word: "How I want a drink alcoholic of course after the heavy lectures involving Quantum Mechanics". split(" ")) {
			scentence.add(word);
		}
		scentence.sort(String::compareToIgnoreCase);
		System.out.println(scentence);
	}

}
