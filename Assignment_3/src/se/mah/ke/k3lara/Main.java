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
	private int setSize = 0;
	private String setColor = "";
	
	

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
		setBounds(100, 100, 484, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea bikeList = new JTextArea();
		bikeList.setBounds(15, 221, 174, 208);
		contentPane.add(bikeList);
		
		JComboBox cmbColor = new JComboBox(Colors.values());
		cmbColor.setBounds(79, 111, 146, 26);
		contentPane.add(cmbColor);
		
		JButton btnSaveBike = new JButton("New button");
		btnSaveBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtPrice.getText().isEmpty() || txtSize.getText().isEmpty()){
					
					JOptionPane.showMessageDialog(null, "you have to price it right");
				}
				else{
				
				_setPrice();
				_setSize();
				setColor = cmbColor.getSelectedItem().toString();
				Bike b = new Bike(setColor,setPrice,setSize);
				display.addBike(b);
				bikeList.setText("");
				bikeList.append(display.getAllBikes());
				
				}
				
			}
		});
		btnSaveBike.setBounds(318, 176, 115, 29);
		contentPane.add(btnSaveBike);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(79, 69, 146, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setBounds(79, 27, 146, 26);
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 245, 212, 56);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setVisibleRowCount(5);
		scrollPane.setColumnHeaderView(list);

		
	}
	private void _setPrice(){
		String text = txtPrice.getText();
		setPrice = Integer.parseInt(text);
	}
	
	private void _setSize(){
		String text = txtSize.getText();
		setSize = Integer.parseInt(text);
	}
}
