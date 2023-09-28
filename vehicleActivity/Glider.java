package vehicleActivity;

import java.util.Random;

public class Glider extends AirVehicle{
	
	private double wingSpan;

	public Glider(String color, double weight, double maxWeight, double minWeight, String fuelType, double maxAltitude, double wingSpan) {
		super(color, weight, maxWeight, minWeight, fuelType, maxAltitude);
			this.wingSpan = wingSpan;
	}
	
	 public double getWingSpan() {
	        return wingSpan;
	    }
	    
	    public static Double setwingSpan(double wingSpan) {
	    	Random rand = new Random();
	    	int max = 100;
	    	int min = 10;
	    	return wingSpan = rand.nextInt(max - min + 1) + min;
	        //this.wingSpan = wingSpan;
	    }
	   
	    public String toString() {
	        return "Glider{" + "wingSpan = " + wingSpan + "m }" + super.toString();
	    }

	
}
