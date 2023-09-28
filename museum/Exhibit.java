package museum;

import java.util.ArrayList;

public class Exhibit {
	
	private DisplayType display;
	private Artifact artifact;
	
	
	public enum DisplayType{WALL, GLASSCASE, PEDISTAL, HANGFROMCELING};
	
	public Exhibit() {
		
	}
	
	public Exhibit(DisplayType display, Artifact artifact) {
		this.display = display;
		this.artifact = artifact;
	}
	
	public ArrayList getArtifactList() {
		return null;
	
	}
	
	public void addArtifact(Artifact newArt) {
		this.artifact = newArt;
		//fix
	}
	
	@Override
	public String toString() {
		return "Exhibit: " + this.display + ", " + this.artifact;
	}
	
}
