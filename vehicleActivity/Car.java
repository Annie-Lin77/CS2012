package vehicleActivity;

import java.util.Random;

public class Car extends LandVehicle{
	
	private String bodyType;

	public Car(String color, double weight, double maxWeight, double minWeight, String fuelType, int numWheels, int numDoors, String bodyType) {
		super(color, weight, maxWeight, minWeight, fuelType, numWheels, numDoors);
			this.bodyType = bodyType;
	}
	
	public String getBodyType() {
        return bodyType;
    }
    
    //need to add body types
    public static String setBodyType(String bodyType) {
    	
    	String [] arr = {"sedan", "fastBack", "coupe", "convertible", "hatchBack"};
    	Random rand = new Random();
    	return bodyType = arr[rand.nextInt(arr.length)];
       // this.bodyType = bodyType;
    }
    
    
    public String toString() {
        return "Car{" + "bodyType = " + bodyType + " }" + super.toString();
    }
}
