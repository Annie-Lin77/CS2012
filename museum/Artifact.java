package museum;

public abstract class Artifact {
	
	private String name;
	private String description;
	private String year;
	
	public Artifact(String name) {
		this.name = name;
	}
	
	public Artifact(String nameOfArtifact, String description, String year) {
		this.name = nameOfArtifact;
		this.description = description;
		this.year = year;
	}
	
	public String getNameOfArtifact() {
		return this.name;
		
	}
	
	public void setNameofArtifact(String nameOfArtifact) {
		this.name = nameOfArtifact;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getWhatYear() {
		return this.year;
	}
	
	public void setWhatYear(String thatYear) {
		this.year = thatYear;
	}
	
	@Override
	public String toString() {
		return "Artifact: " + this.name + ", " + this.description + ", " + this.year;
	}

}
