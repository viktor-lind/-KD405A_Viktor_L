package se.mah.ke.k3lara;

import java.util.ArrayList;

public class BikeStore{
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	
	
	public BikeStore(){
	
		
	}

	public String getAllBikes()
	{
		String s = "";
		for (Bike bike : bikes) {
			s = s + "Color: "+ bike.getColor() + " Price: " + bike.getPrice() + " Size: " + bike.getSize() + "\n";
		}
		return s;
		
		
	}
	public void addBike(Bike s){
		
		this.bikes.add(s);
		
	
	}

}
