package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clock;
	private JTextField txtHour;
	private JTextField txtMinute;
	private JLabel lblTime;
	private JLabel lblAlarm; 
	private int hour;
	private int minute;
	private boolean alarm;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblTime = new JLabel("");
		lblTime.setBackground(Color.BLACK);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("DialogInput", Font.PLAIN, 60));
		lblTime.setBounds(0, 0, 423, 73);
		contentPane.add(lblTime);
		
		txtHour = new JTextField();
		txtHour.setBounds(104, 89, 40, 26);
		contentPane.add(txtHour);
		txtHour.setColumns(10);
		
		txtMinute = new JTextField();
		txtMinute.setBounds(104, 122, 40, 26);
		contentPane.add(txtMinute);
		txtMinute.setColumns(10);
		
		JButton btnSetAlarm = new JButton("Set alarm");
		btnSetAlarm.setBackground(SystemColor.controlLtHighlight);
		btnSetAlarm.setFont(new Font("DialogInput", Font.PLAIN, 16));
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtHour.getText().isEmpty() || txtMinute.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "You have to set alarm!");
				}
				else{
				_setHour();
				_setMinute();
				if(hour > 12 || minute > 60)
				{
					JOptionPane.showMessageDialog(null, "WRONG!!!");
				}
				else{
			    clock.setAlarm(hour, minute);
			    lblAlarm.setText(txtHour.getText() + " : " + txtMinute.getText());}
				}
			}
		});
		btnSetAlarm.setBounds(178, 89, 143, 29);
		contentPane.add(btnSetAlarm);
		
		JButton btnClearAlarm = new JButton("Clear alarm");
		btnClearAlarm.setFont(new Font("DialogInput", Font.PLAIN, 16));
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clock.clearAlarm();
				txtHour.setText("");
				txtMinute.setText("");
				lblAlarm.setText("no alarm");
			}
		});
		btnClearAlarm.setBounds(178, 121, 143, 29);
		contentPane.add(btnClearAlarm);
		
		lblAlarm = new JLabel("No alarm");
		lblAlarm.setForeground(Color.WHITE);
		lblAlarm.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblAlarm.setBounds(15, 182, 199, 46);
		contentPane.add(lblAlarm);
		
		JLabel lblSetHour = new JLabel("Set hour:");
		lblSetHour.setForeground(Color.WHITE);
		lblSetHour.setBounds(20, 92, 69, 20);
		contentPane.add(lblSetHour);
		
		JLabel lblSetMinute = new JLabel("Set minute:");
		lblSetMinute.setForeground(Color.WHITE);
		lblSetMinute.setBounds(15, 125, 89, 20);
		contentPane.add(lblSetMinute);
		
		clock = new ClockLogic(this);
	}
	
	public void setTimeOnLabel(String time){
		lblTime.setText(time);
	}
		
	public void activateAlarm(boolean activate){
		alarm = activate;
		if(alarm == true){
			JOptionPane.showMessageDialog(null, "ALARM!!!");
			clock.clearAlarm();
		}
		
		
	}
	private void _setHour(){
		String text = txtHour.getText();
		hour = Integer.parseInt(text);
	}
	
	private void _setMinute(){
		String text = txtMinute.getText();
		minute = Integer.parseInt(text);
	}
}
