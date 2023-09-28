package customStringHW;
import java.util.ArrayList;
import java.util.List;

public class CustomString {
	
	private char data[];

	public CustomString(char data[]) {
		
		 this.data = data;
	    }

	public CustomString changeCase() {
	
		char [] newData = new char[data.length];
		for(int i = 0; i < data.length; i++){
			char a = data[i];
		if(Character.isUpperCase(a)){
			newData[i] = Character.toLowerCase(a);
			}
		else if(Character.isLowerCase(a)){
			newData[i] = Character.toUpperCase(a);
		}
			else{
		newData[i] = a;
		}
		}
		return new CustomString(newData);
	}

	public char charAt(int i) {
		return data[i];
	}
	
	public int compareTo(CustomString rhs) {
		String s1 = this.toString().toLowerCase();
		String s2 = rhs.toString().toLowerCase();
		return s1.compareTo(s2);
	}
	
	public CustomString concat(CustomString rhs){
		char[] newData = new char[data.length + rhs.length()];
		System.arraycopy(data, 0, newData, 0, data.length);
		System.arraycopy(rhs.data, 0, newData, data.length, rhs.length());
		return new CustomString(newData);
	}
		
	public boolean equals(CustomString rhs){
		return this.compareTo(rhs) == 0;
	}

	public int length(){
		return data.length;
	}
		
	public CustomString[] split(char delimiter){
		List <CustomString> list = new ArrayList<>();
		int start = 0;
		for(int i = 0; i < data.length; i++){
		if(data[i] == delimiter){
		int end = i;
		CustomString part = substring(start,end);
		list.add(part);
		start = i + 1;
		}
		}
		CustomString part = substring(start);
		list.add(part);
		return list.toArray(new CustomString[list.size()]);
	}

	public CustomString substring(int srcBegin){
		return substring(srcBegin,data.length);
	}

	public CustomString substring(int srcBegin,int srcEnd){
		char[]newData = new char[srcEnd - srcBegin];
		System.arraycopy(data, srcBegin, newData, 0, srcEnd - srcBegin);
		return new CustomString(newData);
	}
		
	public CustomString titleize(){
		char[] newData = new char[data.length];
		for(int i = 0; i < data.length; i++){
		char c = data[i];
		if(Character.isWhitespace(c)){
		newData[i] = c;
		}
		else{
		newData[i] = Character.toUpperCase(c);
		}
		}
		return new CustomString(newData);
	}
	
	public CustomString toLowerCase(){
		char[] newData = new char[data.length];
		for(int i =0; i <data.length; i++){
		newData[i] = Character.toLowerCase(data[i]);
		}
		return new CustomString(newData);
	}
	
	public CustomString toUpperCase(){
		char[]newData = new char[data.length];
		for(int i = 0; i <data.length; i++){
		newData[i] = Character.toUpperCase(data[i]);
		}
		return new CustomString(newData);
	}
		
	public String toString(){
		return new String(data);
		}
	}
