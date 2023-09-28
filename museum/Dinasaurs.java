package museum;

public class Dinasaurs extends Artifact{
	
	public String dino;
	
	public Dinasaurs(String nameOfThisArtifact) {
		super(nameOfThisArtifact);
	}

	public Dinasaurs(String nameOfThisArtifact, String typeOfDinosaur, String description, String year) {
		super(nameOfThisArtifact, description, year);
		this.dino = typeOfDinosaur;
	}
	
	public String getTypeOfDinasaur() {
		return this.dino;
	}
	
	public void setTypeOfDinasaur(String typeOfDinasaur) {
		this.dino = typeOfDinasaur;
	}

	@Override
	public String toString() {
		return "Dinosaur: " + this.dino + super.toString();
	}
}
