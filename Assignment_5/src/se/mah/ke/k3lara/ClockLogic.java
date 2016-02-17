package se.mah.ke.k3lara;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockLogic {
	
	private DigitalClockGUI clockGui;
	private int alarmHour;
	private int alarmMinute;
	private DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a"); 
	private DateFormat timeFormatAlarm = new SimpleDateFormat("hh:mm");
	
	

	public ClockLogic(DigitalClockGUI digitalClockGui) {
		this.clockGui = digitalClockGui;
		ClockThread clockThread = new ClockThread();
		clockThread.start();
		System.out.println(clockGui);
			
		
	}
	
	public void setAlarm(int hour, int minute){
		this.alarmHour = hour;
		this.alarmMinute = minute;
		System.out.println(hour + " : " + minute);
		
	}
	
	public void clearAlarm(){
		alarmHour = 0;
		alarmMinute = 61;
		System.out.println(alarmHour + " " + alarmMinute);
	}
	
	public class ClockThread extends Thread{
		public void run(){
			while(true){
				try {
					Thread.sleep(100);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Date date = new Date();
				String time = timeFormat.format(date);
				clockGui.setTimeOnLabel(time);
				String time2 = timeFormatAlarm.format(date);
				System.out.println(time2.toString());
				if(alarmHour<10&&alarmMinute>9){
					if(time2.equals("0"+alarmHour+":"+alarmMinute)){
						clockGui.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					}
					else{
						clockGui.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
					}
				if(alarmHour>9&&alarmMinute<10){
					if(time2.equals(alarmHour + ":" + "0" + alarmMinute)){
						clockGui.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					}
					else{
						clockGui.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
					}
				if(alarmHour<10&&alarmMinute<10){
					if(time2.equals("0" + alarmHour + ":" + "0" + alarmMinute)){
						clockGui.activateAlarm(true);
						boolean test = true;
						System.out.println(test);
					}
					else{
						clockGui.activateAlarm(false);
						boolean test = false;
						System.out.print(test);
					}
					}
			}
		}
		
	}

}
