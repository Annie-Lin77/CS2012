package videoGameOrganizerHW05;

public class GameData {
	
	private String rank;
	private String name;
	private String platform;
	private String year;
	private String genre;
	private String publisher;
	private String naSales;
	private String jpSales;
	private String euSales;
	private String otherSales;
	private String globalSales;
	private String allSales;

	// Constructor
	public GameData(String rank, String name, String platform, String year, String genre, String publisher, String naSales, String euSales,String jpSales, String otherSales, String globalSales) {
	this.rank = rank;
	this.name = name;
	this.platform = platform;
	this.year = year;
	this.genre = genre;
	this.publisher = publisher;
	this.naSales = naSales;
	this.jpSales = jpSales;
	this.euSales = euSales;
	this.otherSales = otherSales;
	this.globalSales = globalSales;
	this.allSales = allSales;
	}

		// TODO Auto-generated constructor stub

		// Getter and setters
		public void setRank(String rank) {
			this.rank = rank;
		}
		
		public String getRank() {
			return rank;
		}
		
		public void setName(String name) {
		this.name = name;
		}
		
		public String getName() {
		return name;
		}
		
		public void setPlatform(String platform) {
		this.platform = platform;
		}
		
		public String getPlatform() {
		return platform;
		}
		
		public void setYear(String year) {
		this.year = year;
		}
		
		public String getYear() {
		return year;
		}
		
		public void setGenre(String genre) {
		this.genre = genre;
		}
		
		public String getGenre() {
		return genre;
		}
		
		public void setPublisher(String publisher) {
		this.publisher = publisher;
		}
		
		public String getPublisher() {
		return publisher;
		}
		
		public void setNaSales(String naSales) {
		this.naSales = naSales;
		}
		
		public String getNaSales() {
		return naSales;
		}
		
		public void setJpSales(String jpSales) {
		this.jpSales = jpSales;
		}
		
		public String getJpSales() {
		return jpSales;
		}
		
		public void setEuSales(String euSales) {
		this.euSales = euSales;
		}
		
		public String getEuSales() {
		return euSales;
		}
		
		public void setOtherSales(String otherSales) {
		this.otherSales = otherSales;
		}
		
		public String getOtherSales() {
		return otherSales;
		}
		
		public void setGlobalSales(String globalSales) {
			this.globalSales = globalSales;
		}
		
		public String getGlobalSales() {
		return globalSales;
		}
		
		public void setAllSales(String allSales) {
			this.allSales = allSales;
		}
		
		public String getAllSales() {
			return naSales + euSales + jpSales + otherSales + globalSales;
		}
		
		public String toString() {
			return this.getRank() + ", " + this.getName() + ", " + this.getPlatform() + ", " + this.getYear() + ", " + this.getGenre() + ", " + this.getPublisher() + ", " + this.getNaSales() + ", " + this.getEuSales() + ", " + this.getJpSales() + ", " + this.getOtherSales() + ", " + this.getGlobalSales();
		}
		}
