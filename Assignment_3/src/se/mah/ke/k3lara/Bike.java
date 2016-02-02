package se.mah.ke.k3lara;

import javax.swing.JOptionPane;

public class Bike {

	public String color;
	private int price;
	private int size;
	BikeStore bike;
	private boolean _price = false;
	private boolean _size = false;
	
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
		System.out.println(color + size + price);
		
		
	}
	
	public String getColor()
	{
		
	   return color;	
	   
	}
	
	public int getPrice()
	{
	    if(checkPrice() == true){
	    	price = Constants.MAX_PRICE; 
	    }
		return price;
	}
	
	public int getSize()
	{
		if(checkSize() == true)
		{
			return size;
		}
		else
		{
			
			size = Constants.MIN_SIZE;
		}
		
		return size;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public boolean checkPrice()
	{
        if(price > Constants.MAX_PRICE)
        {
        	_price = true;
        	
        	
        }
		return _price;
	}
	public boolean checkSize(){
		
		if(size <= Constants.MAX_SIZE && size >= Constants.MIN_SIZE){
			_size = true;
		}
		return _size;
	}
	
	

}
