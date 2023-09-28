package videoGameOrganizerHW05;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoGameRunner {
	
	public static void main(String[] args) {
		
		
		String path = "vgsales.txt";
		String line = "";
		
		//list that holds all the game data 
		List<GameData> gameData = new ArrayList<>();
		
			try {
				//reads file
				BufferedReader br = new BufferedReader(new FileReader(path));
				
				while((line = br.readLine()) != null) {
					String [] values = line.split(",");
					String rank = values[0];
					String name = values[1];
					String platform = values[2];
					String year = values[3];
					String genre = values[4];
					String publisher = values[5];
					String naSales = values[6];
					String euSales = values[7];
					String jpSales = values[8];
					String otherSales = values[9];
					String globalSales = values[10];
					
					//made everything a string- code wouldn't work when it was an int or double
					
					GameData Game = new GameData(rank, name, platform, year, genre, publisher, naSales, euSales, jpSales, otherSales, globalSales);
					//puts everything into list
					gameData.add(Game);
				
					//video game runner code (couldn't get it to work in a separate java file)
					//video game collection menu
					
					System.out.println("To start video game collector, enter 0: ");
					Scanner input = new Scanner(System.in);
					int a = input.nextInt();
					
					while(a == 0) {
						//collection option menu
					System.out.println("Video Game Collection Menu:");
					System.out.println("Plase choose a collection option by typing in the letter:");
					System.out.println("___________________________________________________________________");
					System.out.println("(1) Genre  |  (2) Platform  | (3) Publisher  | (4) Total Revenue  |");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("Please enter (1-4) or type '5' to stop the program: ");
					
					int option = input.nextInt();
					input.nextLine();
					
					// collect by genre
					if( option == 1) {
						System.out.println("Please type in your desired genre: ");
						String genres = input.next();
						 if(genre.contains("\"" + genres + "\"")) {
						 PrintWriter prtout = new PrintWriter(new File(genres + "Games.txt"));
						 prtout.println(Game.toString());
						 System.out.println(genres + " games have been collected!");
						 }
						 else {
							 System.out.println(genres + " games was not sucessfully collected, please try again");
						 }
					}
					
					//collect by platform
					if( option == 2) {
						System.out.println("Please type in your desired platform: ");
						String platforms = input.next();
						 if(platform.contains("\"" + platform + "\"")) {
						 PrintWriter prtout = new PrintWriter(new File(platforms + "Games.txt"));
						 prtout.println(Game.toString());
						 System.out.println(platforms + " games have been collected!");
						 }
						 else {
							 System.out.println(platforms + " games was not sucessfully collected, please try again");
						 }
					}
					
					//collect by publisher 
					
					if( option == 3) {
						System.out.println("Please type in your desired publisher: ");
						String publishers = input.next();
						 if(publisher.contains("\"" + publishers + "\"")) {
						 PrintWriter prtout = new PrintWriter(new File(publishers + "Games.txt"));
						 prtout.println(Game.toString());
						 System.out.println(publishers + " games have been collected!");
						 }
						 else {
							 System.out.println(publishers + " games was not sucessfully collected, please try again");
						 }
					}
					
					//collect by total revenue
					if( option == 4) {
						System.out.println("Please type in your desired total revenue: ");
						Double revenue = input.nextDouble();
						
						System.out.println("Please enter a letter correspoding to if you want games (a) above, or (b) below the desired value: ");
						Scanner scan = new Scanner(System.in);
						int scans = scan.nextInt();
						
						
						//above desired value
						if(scans == a) {
						 if(revenue.valueOf("\"" + revenue + "\"") != null) {
						 PrintWriter prtout = new PrintWriter(new File("Games above " +revenue + ".txt"));
						 prtout.println(Game.toString());
						 System.out.println(revenue + " games have been collected!");
						 
						 }
						 else {
								System.out.println(revenue + " games was not sucessfully collected, please try again");
								 
							 }
						}
						
						else{
						
							 if(revenue.valueOf("\"" + revenue + "\"") != null) {
							 PrintWriter prtout = new PrintWriter(new File("Games below " +revenue + ".txt"));
							 prtout.println(Game.toString());
							 System.out.println(revenue + " games have been collected!");
							 }
							 else {
								System.out.println(revenue + " games was not sucessfully collected, please try again");
								 
							 }
						}
					}
					
					//exit program
					if( option == 5) {
						System.out.println("Thank you for using video game collection menu. ");
						break;
					}
					}
	}		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
	}
}