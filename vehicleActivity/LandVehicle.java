package vehicleActivity;

import java.util.Random;

public class LandVehicle extends Vehicle{
	
	private int numWheels;
    private int numDoors;
    
    public LandVehicle(String color, double weight, double maxWeight, double minWeight, String fuelType, int numWheels, int numDoors) {
        super(color, weight, maxWeight, minWeight, fuelType);
        this.numWheels = numWheels;
        this.numDoors = numDoors;
    }
    
    public int getNumWheels() {
        return numWheels;
    }
    
    public static int setNumWheels(int numWheels) {
    	return numWheels = 4;
        //this.numWheels = numWheels;
    }
    
    public int getNumDoors() {
        return numDoors;
    }
    
    public static int setNumDoors(int numDoors) {
    	Random rand = new Random();
    	int max = 4;
    	int min = 2;
    	return numDoors = rand.nextInt(max - min + 1) + min;
    	
       // this.numDoors = numDoors;
    }
    @Override
    public String toString() {
        return "LandVehicle{" + "numWheels = " + numWheels + ", numDoors = " + numDoors + "} " + super.toString();
    }
}
