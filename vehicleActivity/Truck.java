package vehicleActivity;

import java.util.Random;

public class Truck extends LandVehicle{

	private int cargoSize;
	private int maxSize;
	private int minSize;
	private String cargoType;

	public Truck(String color, double weight, double maxWeight, double minWeight, String fuelType, int numWheels, int numDoors,
			int cargoSize, int maxSize, int minSize, String cargoType) {
		super(color, weight, maxWeight, minWeight, fuelType, numWheels, numDoors);
		this.cargoSize = cargoSize;
		this.maxSize = maxSize;
		this.minSize = minSize;
		this.cargoType = cargoType;
	}
	
	public int getCargoSize() {
        return cargoSize;
    }
    
    public static int setCargoSize(int cargoSize) {
    	Random rand = new Random();
    	int max = 10000;
    	int min = 0;
    	return cargoSize = rand.nextInt(max - min + 1) + min;
        //this.cargoSize = cargoSize;
    }
    
    public int getMaxSize() {
    	 return maxSize;
    }
    
    public static int setMaxSize(int maxSize) {
    	return maxSize = 100;
    	//this.maxSize = maxSize;
    }
    
    public int getMinSize() {
   	 	return minSize;
   }
   
   public static int setMinSize(int minSize) {
	  return minSize = 10;
   		//this.minSize = minSize;
   }
    
    public String getCargoType() {
        return cargoType;
    }
    
    //need to add cargo types
    public static String setCargoType(String cargoType) {
    	String [] arr = {"openBed", "boxTruck", "van", "minivan", "dumpTruck"};
    	Random rand = new Random();
    	return cargoType = arr[rand.nextInt(arr.length)];
       // this.cargoType = cargoType;
    }
    
    
    public String toString() {
        return "Truck{" + "cargoSize = " + cargoSize + "m, maxSize = " + maxSize + "m, minSize = " + minSize + "m, cargoType = "+ cargoType + "} " + super.toString();
    }

}
