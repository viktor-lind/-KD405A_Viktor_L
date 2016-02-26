package se.mah.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;

public class SkanetrafikenGUI extends JFrame {

	public JPanel contentPane;
	public JTextField txtSearch;
	public JTextArea txtareaResult; 
	public JScrollPane scrollPane_1;
	public JTextArea txtToResult;
	public JTextField txtFrom;
	public JTextField txtToStation;
	public JButton btnSearchAll;
	public String stationName;
	SkanetrafikenGUI gui = this;
	Parser p = new Parser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 746);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(384, 65, 717, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 183, 644, 328);
		panel.add(scrollPane_1);
		
		txtToResult = new JTextArea();
		scrollPane_1.setViewportView(txtToResult);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(38, 68, 146, 26);
		panel.add(txtFrom);
		txtFrom.setColumns(10);
		
		txtToStation = new JTextField();
		txtToStation.setBounds(385, 68, 146, 26);
		panel.add(txtToStation);
		txtToStation.setColumns(10);
		
		btnSearchAll = new JButton("Search");
		btnSearchAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnSearchAll.setBounds(567, 527, 115, 29);
		panel.add(btnSearchAll);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setBounds(38, 43, 69, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To:");
		lblNewLabel_1.setBounds(387, 43, 69, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Results:");
		lblNewLabel_2.setBounds(38, 153, 69, 20);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(13, 64, 356, 373);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 74, 332, 283);
		panel_1.add(scrollPane);
		
		txtareaResult = new JTextArea();
		scrollPane.setViewportView(txtareaResult);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(15, 32, 190, 26);
		panel_1.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(232, 29, 115, 29);
		panel_1.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtareaResult.setText("Searching");
				stationName = gui.txtSearch.getText();
				stationName = stationName.substring(0,1).toUpperCase() + stationName.substring(1).toLowerCase();
				System.out.println(stationName);
				
				new j().start();
				
			}
		});
		
		
	}
	
	private class j extends Thread{
		@Override 
		public void run(){
			
			
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			searchStations.addAll(Parser.getStationsFromURL(stationName));
			txtareaResult.setText("");
			for (Station s: searchStations){
				/**System.out.println(s.getStationName() +" number:" +s.getStationNbr());*/
				if(s.getStationName().contains(stationName)){
					
				txtareaResult.append(s.getStationNbr() + " " + s.getStationName() + " " + s.getLatitude() + " " + s.getLongitude() + "\n");
				
				}
				
			}

			
		}
	}
}
