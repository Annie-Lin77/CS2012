package vehicleActivity;

import java.util.Random;

public class Vehicle {
	
	private String color;  
	private double weight;
	private double maxWeight;
	private double minWeight;
	private String fuelType;
	
	public Vehicle(String color, double weight, double maxWeight, double minWeight, String fuelType) {

	    this.color = color;
	    this.weight = weight;
	    this.maxWeight = maxWeight;
	    this.minWeight = minWeight;
	    this.fuelType = fuelType;
	    }
	
	public String getColor() {
	        return color;
	    }
	
	public static String setColor(String color) {
		String [] arr = {"black", "white", "blue", "green", "red", "grey", "purple"};
    	Random rand = new Random();
    	color = arr[rand.nextInt(arr.length)];
    	return color;
	   // this.color = color;
	    }
	
	public double getWeight() {
	        return weight;
	    }
	
	public static Double setWeight(double weight) {
		Random rand = new Random();
    	int max = 10000;
    	int min = 200;
    	return weight = rand.nextInt(max - min + 1) + min;
	    }
	
	public double getMaxWeight() {
	        return maxWeight;
	    }
	
	public static Double setMaxWeight(double maxWeight) {
		Random rand = new Random();
    	int max = 10000;
    	int min = 1000;
    	maxWeight = rand.nextInt(max - min + 1) + min;
    	return maxWeight;
	  //  this.maxWeight = maxWeight;
	    }
	
	public double getMinWeight() {
	        return minWeight;
	    }
	
	public static Double setMinWeight(double minWeight) {
		Random rand = new Random();
    	int max = 900;
    	int min = 100;
    	return minWeight = rand.nextInt(max - min + 1) + min;
	  //      this.minWeight = minWeight;
	    }
	
	public String getFuelType() {
	        return fuelType;
	    }
	
	public static String setFuelType(String fuelType) {
		String [] arr = {"animal-powered", "gas", "electric", "disel", "kerosene", "methane"};
    	Random rand = new Random();
    	return fuelType = arr[rand.nextInt(arr.length)];
	  //  this.fuelType = fuelType;
	    }
	
	@Override
	public String toString() {
		
	    return "Vehicle{" + "color = " + color  + ", weight = " + weight + "kg , maxWeight = " + maxWeight + "kg , minWeight = " + minWeight + "kg, fuelType = " + fuelType + '}';
	    }
	}
