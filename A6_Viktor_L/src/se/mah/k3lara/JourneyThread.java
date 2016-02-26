package se.mah.k3lara;

import java.util.ArrayList;
import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneyThread extends Thread {
	
	private SkanetrafikenGUI gui;
	private Parser parser;

	public JourneyThread(SkanetrafikenGUI g,Parser p) {
		this.gui = g;
		this.parser = p;
		
	}
	
	public void Run(){
		gui.txtareaResult.setText("Searching");
		
		/**String searchURL = Constants.getURL(gui.txtFrom.getText(),gui.txtToStation.getText(),1); //Malm� C = 80000,  Lund C, 81216 Malm� Gatorg 80100, H�ssleholm C 93070
		
		
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			gui.txtToResult.append(journey.getStartStation()+" - ");
			gui.txtToResult.append(journey.getEndStation().getStationName());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			gui.txtToResult.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
	}
	*/
	
	
	}}
