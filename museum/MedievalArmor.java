package museum;

public class MedievalArmor extends Artifact implements Cursed {
	
	private String owner;
	private boolean cursed;
	private boolean magicprotec;
	private String armor;
	
	public MedievalArmor(String nameOfThisArtifact) {
		super(nameOfThisArtifact);
	}

	public MedievalArmor(String nameOfThisArtifact, String origionalOwner, boolean isCursed, boolean magicProtection,
			String description, String year, String armorType) {
		super(nameOfThisArtifact, description, year);
		
		this.owner = origionalOwner;
		this.cursed = isCursed;
		this.magicprotec = magicProtection;
		this.armor = armorType;
	}
	
	public String getArmorType() {
		return this.armor;
	}
	
	public void setArmorType(String armorType) {
		this.armor = armorType;
	}
	
	public String getOriginalOwner() {
		return this.owner;
	}
	
	public void setOriginalOwner(String origionalOwner) {
		this.owner = origionalOwner;
	}
	
	@Override
	public String toString() {
		return "Medieval Armor: " + this.owner + ", " + this.cursed + ", " + this.magicprotec + ", " + this.armor + super.toString();
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
