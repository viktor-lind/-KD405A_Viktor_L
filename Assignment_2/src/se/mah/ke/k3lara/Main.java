package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;
	private Calculator myCalculator;

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
		myCalculator = new Calculator();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*_cal = new Calculator();
		int n1 = _cal.getN1();
		int n2 = _cal.getN2();*/
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 28));
		textArea.setRows(1);
		textArea.setBounds(15, 26, 402, 56);
		contentPane.add(textArea);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 121, 398, 357);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btnOne.setBounds(15, 16, 79, 71);
		panel.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btnTwo.setBounds(109, 16, 79, 71);
		panel.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		btnThree.setBounds(203, 16, 79, 71);
		panel.add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnFour.setBounds(15, 103, 79, 71);
		panel.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btnFive.setBounds(109, 103, 79, 71);
		panel.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btnSix.setBounds(203, 103, 79, 71);
		panel.add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnSeven.setBounds(15, 190, 79, 71);
		panel.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btnEight.setBounds(109, 190, 79, 71);
		panel.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btnNine.setBounds(203, 190, 79, 71);
		panel.add(btnNine);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("+ ");
				myCalculator.plus();
				
			}
		});
		btnPlus.setBounds(297, 27, 86, 39);
		panel.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("- ");
				myCalculator.minus();
			}
		});
		btnMinus.setBounds(297, 88, 86, 39);
		panel.add(btnMinus);
		
		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("* ");
				myCalculator.mult();
			}
		});
		btnTimes.setBounds(297, 150, 86, 39);
		panel.add(btnTimes);
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		btnResult.setBounds(203, 277, 153, 47);
		panel.add(btnResult);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(35, 277, 153, 47);
		panel.add(btnClear);
	}
}
