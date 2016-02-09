package se.mah.ke.k3lara.Assignment4A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtHuman;
	private JTextField txtDog;
	private JTextArea txtInfo;
	Human human;

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
		setBounds(100, 100, 696, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHuman = new JTextField();
		txtHuman.setBounds(100, 33, 146, 26);
		contentPane.add(txtHuman);
		txtHuman.setColumns(10);
		
		txtDog = new JTextField();
		txtDog.setBounds(100, 77, 146, 26);
		contentPane.add(txtDog);
		txtDog.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.setBounds(296, 32, 131, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnNewDog = new JButton("New Dog");
		
		btnNewDog.setBounds(296, 76, 131, 29);
		contentPane.add(btnNewDog);
		
		JButton btnPrntInfo = new JButton("Print Info");
		
		btnPrntInfo.setBounds(296, 121, 131, 29);
		contentPane.add(btnPrntInfo);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 175, 401, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtInfo = new JTextArea();
		txtInfo.setBounds(15, 16, 371, 46);
		panel.add(txtInfo);
		
		JLabel lblNewLabel = new JLabel("Namn:");
		lblNewLabel.setBounds(16, 36, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Namn:");
		lblNewLabel_1.setBounds(16, 80, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		/**Button to add Human*/
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtHuman.getText().length()<3){
					JOptionPane.showMessageDialog(null, "Ett namn saknas!");

				}
				else{
				human = new Human(txtHuman.getText());
				}
				
				
			}
		});
		/**Button to print info*/
		btnPrntInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtHuman.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Du har gjort fel!");
				}else{
                txtInfo.setText(human.getInfo());}
                

			}
		});
		/**Button to add new Dog*/
		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtHuman.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Du m�ste skapa en �gare innan du kan skapa en hund");
				}
				else{
				Dog dog = new Dog(txtDog.getText());
				human.buyDog(dog);
				}
				
			}
		});
	}
}
