package se.mah.ke.k3lara;

import javax.swing.JOptionPane;

public class House {

	private int yearBuilt;
	private int size;
	private final int minSize = 10;
	private int maxSize = 1001;
	private boolean areaOk = false;
	private boolean yearOk = false;
	private String line;
	
	
	public House(int yearBuilt, int size) {
		this.yearBuilt = yearBuilt;
		this.size = size;
	}
	
	public int getYearBuilt()
	{
		if(_checkYear() == false)
		{
			JOptionPane.showInputDialog(null, "NOOOO!");
		}
		return yearBuilt;
		
		
	}
	
	public int getSize()
	{
		if(_checkArea() == false)
		{
			JOptionPane.showInputDialog(null, "House area is too small");
		}
		return size;
	}
	public String getLine(){
		
		line = "Ett hus byggt " + yearBuilt + " som är " + size + " kvm stort ";
		
		
		return line;
	}
	private boolean _checkArea()
	{
		if(size > minSize && size < maxSize)
		{
			areaOk = true;
		}
		else
		{
			areaOk = false;
		}
		return areaOk;
		
	}
	private boolean _checkYear()
	{
		if(yearBuilt < 2015 && yearBuilt > 1800)
		{
			yearOk = true;
		}
		else
		{
			yearOk = false;
		}
		return yearOk;
		
	}
	

}
