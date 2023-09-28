package vehicleActivity;
import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class VehicleFactoryMain {
	
	public static void main(String args[] ){
		
		//car
		ArrayList<Object> car = new ArrayList<Object>();
		String color = Car.setColor(null);
		Double weight = Car.setWeight(0);
		Double maxweight = Car.setMaxWeight(0);
		Double min = Car.setMinWeight(0);
		String fuel = Car.setFuelType(null);
		int wheels = Car.setNumWheels(0);
		int doors = Car.setNumDoors(0);
		String body = Car.setBodyType(null);
		
		car.add(color);
		car.add(weight);
		car.add(maxweight);
		car.add(min);
		car.add(fuel);
		car.add(wheels);
		car.add(doors);
		car.add(body);
		
		
		//truck
		ArrayList<Object> truck = new ArrayList<>();
		String Tcolor = Truck.setColor(null);
		Double Tweight = Truck.setWeight(0);
		Double Tmaxweight = Truck.setMaxWeight(0);
		Double Tmin = Truck.setMinWeight(0);
		String Tfuel = Truck.setFuelType(null);
		int Twheels = Truck.setNumWheels(0);
		int Tdoors = Truck.setNumDoors(0);
		int Tcargo = Truck.setCargoSize(0);
		int TmSize = Truck.setMaxSize(0);
		int Tsize = Truck.setMinSize(0);
		String Tcargotype = Truck.setCargoType(null);
		String Tbody = Car.setBodyType(null);
		
		truck.add(Tcolor);
		truck.add(Tweight);
		truck.add(Tmaxweight);
		truck.add(Tmin);
		truck.add(Tfuel);
		truck.add(Twheels);
		truck.add(Tdoors);
		truck.add(Tcargo);
		truck.add(TmSize);
		truck.add(Tsize);
		truck.add(Tcargotype);
		truck.add(Tbody);
		
		
		//balloon
		ArrayList<Object> balloon = new ArrayList<>();
		String Bcolor = Balloon.setColor(null);
		Double Bwieght = Balloon.setWeight(0);
		Double Bmwieght = Balloon.setMaxWeight(0);
		Double Bminwieght = Balloon.setMinWeight(0);
		String Bfuel = Balloon.setFuelType(null);
		Double Balti = Balloon.setMaxAltitude(0);
		String Bgas = Balloon.setBouyantGas(null);
		
		balloon.add(Bcolor);
		balloon.add(Bwieght);
		balloon.add(Bmwieght);
		balloon.add(Bminwieght);
		balloon.add(Bfuel);
		balloon.add(Balti);
		balloon.add(Bgas);
		

		//glider
		ArrayList<Object> glider = new ArrayList<>();
		String Gcolor = Glider.setColor(null);
		Double Gwieght = Glider.setWeight(0);
		Double Gmaxw = Glider.setMaxWeight(0);
		Double Gmweight = Glider.setMinWeight(0);
		String Gfuel = Glider.setFuelType(null);
		Double Galti = Glider.setMaxAltitude(0);
		Double Gwing = Glider.setwingSpan(0); 
		
		glider.add(Gcolor);
		glider.add(Gwieght);
		glider.add(Gmaxw);
		glider.add(Gmweight);
		glider.add(Gfuel);
		glider.add(Galti);
		glider.add(Gwing);
		
	
		String pathString = "Vehicle.txt";
		try {
		File file = new File(pathString);
		PrintWriter prtout = new PrintWriter(file);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		prtout.println("Number of Vehicles produced: 4");
		prtout.println("Vehicles Generated on: " + formatter.format(now));
		prtout.println("------------------------------------------------------------------");
		prtout.println("Car- " + car.toString());
		prtout.println("Truck -" + truck.toString());
		prtout.println("Balloon- " + balloon.toString());
		prtout.println("Glider- " + glider.toString());
		prtout.close();
		prtout.flush();
		
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
