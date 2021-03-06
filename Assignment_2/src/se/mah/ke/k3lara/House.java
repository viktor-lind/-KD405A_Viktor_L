package se.mah.ke.k3lara;

import javax.swing.JOptionPane;

public class House {

	private int yearBuilt;
	private int size;
	private final int minSize = 10;
	private final int maxSize = 1001;
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
			JOptionPane.showMessageDialog(null, "Your house must be built between 1800 and 2015");
		}
		return yearBuilt;
		
		
	}
	
	public int getSize()
	{
		if(_checkArea() == false)
		{
			size = minSize;
			JOptionPane.showMessageDialog(null, "Your house can not be smaller than 10 kvm or larger than 1000 kvm \n You've been assigned a default value");
		}
		return size;
	}
	public String getLine(){
		
		line = "Ett hus byggt " + yearBuilt + " som �r " + size + " kvm stort ";
		
		
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
