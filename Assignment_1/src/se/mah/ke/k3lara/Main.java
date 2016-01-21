package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtCarlCarlsson;
	private JTextField textField;
	private JTextField txtDsvgen;
	private JTextField textField_1;
	private JTextField txtSverige;
	private JTextField txtCarlssonteliacom;
	private JTextField textField_2;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 586);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		menuBar.setBackground(UIManager.getColor("InternalFrame.resizeIconHighlight"));
		menuBar.setBounds(0, 0, 1292, 59);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setFont(new Font("Roboto", Font.PLAIN, 20));
		menuBar.add(mnMenu);
		
		JMenuItem mntmHome = new JMenuItem("Skriv ut");
		mntmHome.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnMenu.add(mntmHome);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Avsluta");
		mntmNewMenuItem_1.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		mnNewMenu.setFont(new Font("Roboto", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ny medlem");
		mntmNewMenuItem_2.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Hitta medlem");
		mntmNewMenuItem.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setFont(new Font("Roboto", Font.PLAIN, 20));
		menuBar.add(mnHjlp);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Hj\u00E4lp");
		mntmNewMenuItem_4.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnHjlp.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Om programmet");
		mntmNewMenuItem_3.setFont(new Font("Roboto Thin", Font.BOLD, 19));
		mnHjlp.add(mntmNewMenuItem_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 312, 196, 149);
		contentPane.add(scrollPane_1);
		
		
		table = new JTable();
		table.setFont(new Font("Roboto", Font.PLAIN, 17));
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Carl  Carlsson"},
				{"Lenny Lennyson"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
				{"2"},
			},
			new String[] {
				"Members"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.shadow"));
		panel.setBounds(275, 82, 502, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Namn:");
		lblNewLabel.setBounds(15, 16, 58, 20);
		panel.add(lblNewLabel);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(15, 74, 76, 20);
		panel.add(lblAdress);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setBounds(15, 45, 76, 20);
		panel.add(lblPersonnr);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(15, 190, 76, 20);
		panel.add(lblTelefon);
		
		JLabel lblEpost = new JLabel("Epost:");
		lblEpost.setBounds(15, 161, 48, 20);
		panel.add(lblEpost);
		
		JLabel lblNewLabel_2 = new JLabel("Postnr:");
		lblNewLabel_2.setBounds(15, 103, 69, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Land:");
		lblNewLabel_3.setBounds(15, 132, 69, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(287, 45, 187, 107);
		lblNewLabel_4.setIcon(new ImageIcon(Main.class.getResource("/img/Untitled-2.jpg")));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Picture");
		lblNewLabel_5.setBounds(353, 16, 69, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Likes:");
		lblNewLabel_6.setBounds(15, 226, 69, 20);
		panel.add(lblNewLabel_6);
		
		String[] likes = {"Running", "Swimming", "Cycling", "Training", "Other"}; 
		JList list_1 = new JList(likes);
		list_1.setBounds(76, 236, 146, 125);
		panel.add(list_1);
		
		JLabel lblNewLabel_7 = new JLabel("Dislikes:");
		lblNewLabel_7.setBounds(247, 226, 69, 20);
		panel.add(lblNewLabel_7);
		
		String[] dislikes = {"Running", "Treadmills", "Other"};
		JList list_2 = new JList(dislikes);
		list_2.setBounds(331, 236, 143, 125);
		panel.add(list_2);
		
		JButton btnNewButton = new JButton("Save changes");
		btnNewButton.setBounds(289, 184, 185, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(162, 366, 48, 29);
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("+");
		button.setBounds(417, 366, 48, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(86, 366, 48, 29);
		panel.add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(341, 366, 48, 29);
		panel.add(button_2);
		
		txtCarlCarlsson = new JTextField();
		txtCarlCarlsson.setBounds(100, 13, 146, 26);
		txtCarlCarlsson.setText("Carl Carlsson");
		panel.add(txtCarlCarlsson);
		txtCarlCarlsson.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(100, 42, 146, 26);
		textField.setText("8907463718");
		panel.add(textField);
		textField.setColumns(10);
		
		txtDsvgen = new JTextField();
		txtDsvgen.setText("D\u00F6sv\u00E4gen 3");
		txtDsvgen.setBounds(100, 71, 146, 26);
		panel.add(txtDsvgen);
		txtDsvgen.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("22654");
		textField_1.setBounds(100, 100, 146, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		txtSverige = new JTextField();
		txtSverige.setText("Sverige");
		txtSverige.setBounds(100, 129, 146, 26);
		panel.add(txtSverige);
		txtSverige.setColumns(10);
		
		txtCarlssonteliacom = new JTextField();
		txtCarlssonteliacom.setText("carlsson@telia.com");
		txtCarlssonteliacom.setBounds(100, 158, 146, 26);
		panel.add(txtCarlssonteliacom);
		txtCarlssonteliacom.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("0958415263");
		textField_2.setBounds(100, 187, 146, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(31, 82, 141, 162);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/img/Untitled-1.png")));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/img/Gym (1).jpg")));
		label.setBounds(0, 59, 808, 487);
		contentPane.add(label);
		
	}
}
