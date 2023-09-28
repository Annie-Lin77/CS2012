package interfacesActivity;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class InterfacesMain {
	
	public static void main(String[] args) {
		
		ArrayList<Money> moneyList = new ArrayList<Money>();
		ArrayList<Money> moneyList2 = new ArrayList<Money>();
		ArrayList<Time> timeList = new ArrayList<Time>();
		ArrayList<Time> timeList2 = new ArrayList<Time>();
		
		Money money = new Money(43.02);
		Money money2 = new Money(4.75);
		Money money3 = new Money(12.56);
		Money money4 = new Money(0.67);
		Money money5 = new Money(78.10);
		Money money6 = new Money(45.78);
		Money money7 = new Money(2.90);
		Money money8 = new Money(4.67);
		Money money9 = new Money(56.78);
		Money money10 = new Money(12.56);
		moneyList.add(money);
		moneyList.add(money2);
		moneyList.add(money3);
		moneyList.add(money4);
		moneyList.add(money5);
		moneyList2.add(money6);
		moneyList2.add(money7);
		moneyList2.add(money8);
		moneyList2.add(money9);
		moneyList2.add(money10);
		
		Time time = new Time(13, 2, 14);
		Time time2 = new Time(1, 2, 3);
		Time time3 = new Time(11,22,45);
		Time time4 = new Time(14, 50, 22);
		Time time5 = new Time(13, 45, 23);
		Time time6 = new Time(23, 42, 17);
		Time time7 = new Time(14, 36, 19);
		Time time8 = new Time(16, 2, 5);
		Time time9 = new Time(10, 2, 30);
		Time time10 = new Time(5, 29, 34);
		timeList.add(time);
		timeList.add(time2);
		timeList.add(time3);
		timeList.add(time4);
		timeList.add(time5);
		timeList2.add(time6);
		timeList2.add(time7);
		timeList2.add(time8);
		timeList2.add(time9);
		timeList2.add(time10);
		
		
		Collections.shuffle(moneyList);
		Collections.shuffle(moneyList2);
		Collections.shuffle(timeList);
		Collections.shuffle(timeList2);
		
		//adding two lists together 
		ArrayList<Money> newMoney = new ArrayList<Money>();
		ArrayList<Time> newTime = new ArrayList<Time>();
		
		newMoney.addAll(moneyList);
		newMoney.addAll(moneyList2);
		newTime.addAll(timeList);
		newTime.addAll(timeList2);
		
		
		//the 4 for codes are suppose to add and subtract the array at the index but wouldn't work 
		//for(int i = 0; i < moneyList.size(); i++) {
			//newMoney.add(moneyList.get(0) + moneyList2.get(0));
		//}
		
		//for(int i = 0; i < moneyList.size(); i++) {
			//newMoney.add(moneyList.get(0) - moneyList2.get(0));
		//}
		
		//for(int i = 0; i < timeList.size(); i++) {
			//newTime.add(timeList.get(0) + timeList2.get(0));
		//}
		
		//for(int i = 0; i < timeList.size(); i++) {
			//newTime.add(timeList.get(0) - timeList2.get(0));
		//}
		
		System.out.println("Unsorted money and time lists: ");
		System.out.println(newMoney);
		System.out.println(newTime);
		
		Collections.sort(newMoney);
		Collections.sort(newTime);
		
		System.out.println("Sorted money and time lists: ");
		System.out.println(newMoney);
		System.out.println(newTime);
	}

}
