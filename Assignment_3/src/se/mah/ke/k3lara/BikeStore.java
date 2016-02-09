package se.mah.ke.k3lara;

import java.util.ArrayList;

public class BikeStore{
	public ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	public String getAllBikes()
	{
		String line = "";
		for (Bike bike : bikes) {
			line = line + "Bike nr " + bikes.indexOf(bike) + ":      " + "Color: "+ bike.getColor() + "       Price: " + bike.getPrice() + "       Size: " + bike.getSize() + "\n";
		}
		return line;
		
		
	}
	public void addBike(Bike bikes){
		
		this.bikes.add(bikes);

	}

}
