package museum;
import java.util.ArrayList;
import java.util.Random;

public class MyPersona {

	public final String name = "Annie Lin";
	public final String myEmail = "alin42@calstatela.edu";
	private ArrayList<String> sayings = new ArrayList<String>();
	
	public MyPersona() {
		// things that you might say at a Fair or whatever
		sayings.add("Hmm, this is interesting.");
		sayings.add("Oops, sorry I'm late");
		sayings.add("Don't forget to save early, save often.");
		sayings.add("It is what it is");
		sayings.add("I should've stayed at home");
		sayings.add("I'm tired");
		// keep going, need at least 5
	}
	
	public String getRandomSaying() {
		Random rndx = new Random();
		int sayNum = rndx.nextInt(sayings.size());
		return sayings.get(sayNum);
	}
	
	public ArrayList<String> getSayingList(){
		return sayings;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMyEmail() {
		return myEmail;
	}
}
