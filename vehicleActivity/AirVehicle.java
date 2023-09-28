package vehicleActivity;

import java.util.Random;

public class AirVehicle extends Vehicle{
	
	private double maxAltitude;
	
	public AirVehicle(String color, double weight, double maxWeight, double minWeight, String fuelType, double maxAltitude) {
	        super(color, weight, maxWeight, minWeight, fuelType);
	        this.maxAltitude = maxAltitude;
	    }
	
	public double getMaxAltitude() {
	        return maxAltitude;
	    }
	
	public static Double setMaxAltitude(double maxAltitude) {
		Random rand = new Random();
    	int max = 10000;
    	int min = 100;
    	return maxAltitude = rand.nextInt(max - min + 1) + min;
	    //this.maxAltitude = maxAltitude;
	    }
	
	    public String toString() {
	        return "AirVehicle{" + "maxAltitude = " + maxAltitude + "m } " + super.toString();
	    }
}
