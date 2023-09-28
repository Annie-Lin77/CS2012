package museum;

public class Mummy extends Artifact implements Cursed{
	
	private String nameP;
	private boolean cursed;
	private boolean magicprotec;
	
	public Mummy(String nameOfThisArtifact) {
		super(nameOfThisArtifact);
	}

	public Mummy(String nameOfThisArtifact, String nameOfPerson, boolean isCursed, boolean magicProtection, 
			String description, String year) {
		super(nameOfThisArtifact, description, year);
		this.nameP = nameOfPerson;
		this.cursed = isCursed;
		this.magicprotec = magicProtection;
	}
	
	public void setNameOfPerson(String nameOfPerson) {
		this.nameP = nameOfPerson;
	}
	
	public String getNameOfPerson() {
		return this.nameP;
	}
	
	@Override
	public String toString() {
		return "Mummy: " + this.nameP + ", " +  this.cursed + ", " + this.magicprotec + super.toString();
	}

	@Override
	public void applyMagicSeal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMagicSeal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkMagicSeal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getIsCursed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsCursed(boolean x) {
		// TODO Auto-generated method stub
		
	}

}
