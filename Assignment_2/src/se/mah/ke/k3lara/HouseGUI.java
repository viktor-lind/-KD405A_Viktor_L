package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import java.awt.Font;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	Random rand = new Random();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 538, 360);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 19));
		textArea.setRows(50);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		House house1 = new House(1900, 800);
		House house2 = new House(1920, 980);
		House house3 = new House(2000, 1000);
		System.out.println("ett hus byggt " + house1.getYearBuilt() + " som är " + house1.getSize());
		System.out.println("ett hus byggt " + house2.getYearBuilt() + " som är " + house2.getSize());
		System.out.println("ett hus byggt " + house3.getYearBuilt() + " som är " + house3.getSize());
		textArea.append("Uppgift 1.2 \n");
		textArea.append("Ett hus byggt " + house1.getYearBuilt() + " som är " + house1.getSize() + " kvm stort " + "\n");
		textArea.append("Ett hus byggt " + house2.getYearBuilt() + " som är " + house2.getSize() + " kvm stort " + "\n");
		textArea.append("Ett hus byggt " + house3.getYearBuilt() + " som är " + house3.getSize() + " kvm stort " + "\n");
		
		House[] _houseArray = new House[10];
		textArea.append("Uppgift 1.3 \n");
		_houseArray[0] = new House(1920,100);
		_houseArray[1] = new House(1987,100);
		_houseArray[2] = new House(1945,100);
		_houseArray[3] = new House(1987,100);
		_houseArray[4] = new House(1965,100);
		_houseArray[5] = new House(1980,100);
		_houseArray[6] = new House(1940,100);
		_houseArray[7] = new House(1934,100);
		_houseArray[8] = new House(1923,100);
		_houseArray[9] = new House(1956,100);
		
		
		for(int i = 0; i < _houseArray.length; i++)
		{
			textArea.append("Ett hus byggt " + _houseArray[i].getYearBuilt() + " som är " + _houseArray[i].getSize()+ " kvm stort " + "\n");
		}
		
		ArrayList<House> _houseAList = new ArrayList<House>();
		
		textArea.append("Uppgift 1.4 \n");
		for(int i = 0; i < 100; i++)
		{
			int year = rand.nextInt(2015 - 1800) + 1800;
			int _area =rand.nextInt(1000 - 20) + 20;
			_houseAList.add(new House(year,_area));
		}
		
		
		for(int i = 0; i < _houseAList.size(); i++)
		{
		textArea.append(_houseAList.get(i).getLine() + "\n");
		}
		 
		
		
	}
	
}
