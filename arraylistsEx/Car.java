package arraylistsEx;

public class Car {

	private String make;  
	private String model;
	private int year;
	private String license;
	
	public Car(String make, String model, int year, String license) {

	    this.make = make;
	    this.model = model;
	    this.year = year;
	    this.license = license;
	    }
	
	public String getMake() {
	        return make;
	    }
	
	public void setMake(String make) {
	    this.make = make;
	    }
	
	public String getModel() {
	        return model;
	    }
	
	public void setModel(String model) {
	   this.model = model;
	    }
	
	public double getYear() {
	        return year;
	    }
	
	public void setYear(int year) {
	        this.year = year;
	    }
	
	public String getLicense() {
	        return license;
	    }
	
	public void setLicense(String license) {
	   this.license = license;
	    }
	 
	
	@Override
	public String toString() {
		
	    return "Car{" + "make = " + make  + ", model = " + model + ", year = " + year + ", license = " + license +'}';
	    }

}
