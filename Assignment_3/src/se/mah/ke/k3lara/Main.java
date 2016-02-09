package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Main extends JFrame {

	private JPanel contentPane;
	Bike _Bikes;
	BikeStore display = new BikeStore();
	private JTextField txtPrice;
	private JTextField txtSize;
	private int setPrice = 0;
	private int setSize;
	private String setColor;
	private JTextField txtColor;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea bikeList = new JTextArea();
		bikeList.setEditable(false);
		bikeList.setBounds(15, 221, 342, 208);
		contentPane.add(bikeList);
		
		txtColor = new JTextField();
		txtColor.setBounds(79, 111, 146, 26);
		contentPane.add(txtColor);
		txtColor.setColumns(10);
		
		JList list = new JList(display.bikes.toArray());
		list.setBounds(397, 221, 328, 208);
		contentPane.add(list);
		
		JButton btnSaveBike = new JButton("Save");
		btnSaveBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtPrice.getText().isEmpty() || txtSize.getText().isEmpty() || txtColor.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "You have to fill out price, size and color.");
				}
				else{
					_setPrice();
					_setSize();
					_setColor();
					
				
				
				if(setSize >= Constants.MIN_SIZE && setSize <= Constants.MAX_SIZE && setPrice <= Constants.MAX_PRICE)
				{
				/**setColor = cmbColor.getSelectedItem().toString();*/
				Bike b = new Bike(setColor,setSize,setPrice);
				display.addBike(b);
				bikeList.setText("");
				bikeList.append(display.getAllBikes());
				
				txtPrice.setText("");
				txtSize.setText("");
				txtColor.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Size must be bewteen 8-28 \n      max price is 30,000");

				}
				
				
				}
			}
		});
		btnSaveBike.setBounds(56, 176, 301, 29);
		contentPane.add(btnSaveBike);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(79, 27, 146, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setBounds(79, 69, 146, 26);
		contentPane.add(txtSize);
		txtSize.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Price:");
		lblNewLabel.setBounds(15, 30, 49, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(15, 72, 49, 20);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(15, 114, 49, 20);
		contentPane.add(lblColor);
		
		JButton btnColor = new JButton("Check Color");
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i = 0; i < Constants.OK_COLORS.length; i++){
					if(Constants.OK_COLORS[i].equals(txtColor.getText())){
						JOptionPane.showMessageDialog(null, "Color in stock!");
	                    break;						
					}
				}
				

			}
		});
		btnColor.setBounds(240, 110, 117, 29);
		contentPane.add(btnColor);
		
		
		
		
	}
	private void _setPrice(){
		String text = txtPrice.getText();
		setPrice = Integer.parseInt(text);
	}
	
	private void _setSize(){
		String text = txtSize.getText();
		setSize = Integer.parseInt(text);
	}
	private void _setColor(){
		for(int i = 0; i < Constants.OK_COLORS.length; i++){
			if(Constants.OK_COLORS[i].equals(txtColor.getText())){
				setColor = txtColor.getText();	
				break;
			}
			else{
				setColor = "out of stock";
			}
			
		}
		System.out.println(setColor);
	}
}
