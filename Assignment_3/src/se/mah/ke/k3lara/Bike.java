package se.mah.ke.k3lara;

import javax.swing.JOptionPane;

public class Bike {

	public String color;
	private int price;
	private int size;
	BikeStore bike;
	
	public Bike(String color, int size) {
     this.color = color;
     this.size = size;

	}
	/** Constructor*/
	public Bike(String color, int size, int price)
	{
		this.color = color;
		this. size = size;
		this.price = price;
		
		
		
	}
	/**Get method to get color*/
	public String getColor()
	{
		
	   return color;	
	   
	}
	/**Get method to get price*/
	public int getPrice()
	{
		return price;
	}
	/**Get method to get size*/
	public int getSize()
	{
		
		return size;
	}
	/**Method to set price*/
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	

}
