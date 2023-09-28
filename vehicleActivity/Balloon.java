package vehicleActivity;

import java.util.Random;

public class Balloon extends AirVehicle{
	
	private String bouyantGas;

	public Balloon(String color, double weight, double maxWeight, double minWeight, String fuelType, double maxAltitude, String bouyantGas) {
		super(color, weight, maxWeight, minWeight, fuelType, maxAltitude);
			this.bouyantGas = bouyantGas;
	}
	
	 public String getBouyantGas() {
	        return bouyantGas;
	    }
	    
	    //need to change
	
	    public static String setBouyantGas(String bouyantGas) {
	    	String [] arr = {"hot-air", "helium", "hydrogen"};
	    	Random rand = new Random();
	    	return bouyantGas = arr[rand.nextInt(arr.length)];
	       // this.bouyantGas = bouyantGas;
	       
	    }
	    
	    
	    public String toString() {
	        return "Balloon{" + "bouyantGas = " + bouyantGas + " }" + super.toString();
	    }
	
}
