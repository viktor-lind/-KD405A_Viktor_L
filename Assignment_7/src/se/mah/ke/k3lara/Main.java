package se.mah.ke.k3lara;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class Main extends JFrame {

	private JPanel contentPane;
	/**private int hej = 25;
	private int hej2 = 25;
	private int hej3 = 25;
	private int hej4 = 25;
	private int hej5 = 25;
	private int hej6 = 25;
	private int hej7 = 25;
	private int hej8 = 25;
	private int hej9 = 25;
	private int hej10 = 25;
	private int hej11 = 25;
	private int hej12= 25;
	private int pixel1 = 25;
	private int pixel2 = 71;*/

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.FLOOR_5);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**for(int i = 0; i < 100; i++){*/
		//bakgrund
		
		/**px.setPixel(25, 59, Color.WHITE);
		px.setPixel(25, 60, Color.WHITE);
		px.setPixel(25, 61, Color.WHITE);
		px.setPixel(25, 62, Color.WHITE);
		px.setPixel(25, 63, Color.WHITE);
		px.setPixel(25, 64, Color.WHITE);
		px.setPixel(25, 65, Color.WHITE);
		px.setPixel(25, 66, Color.WHITE);
		px.setPixel(25, 67, Color.WHITE);
		px.setPixel(25, 68, Color.WHITE);
		px.setPixel(25, 69, Color.WHITE);
		px.setPixel(25, 70, Color.WHITE);*/
		/**for(int i = 0; i < 13; i++){
			px.setPixel(hej, 70, Color.WHITE);
			hej= hej +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej2, 69, Color.WHITE);
			hej2= hej2 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej3, 68, Color.WHITE);
			hej3= hej3 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej4, 71, Color.WHITE);
			hej4= hej4 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej5, 67, Color.WHITE);
			hej5= hej5 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej6, 66, Color.WHITE);
			hej6= hej6 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej7, 65, Color.WHITE);
			hej7= hej7 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej8, 64, Color.WHITE);
			hej8= hej8 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej9, 63, Color.WHITE);
			hej9= hej9 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej7, 62, Color.WHITE);
			hej10= hej10 +1;
		}
		for(int i = 0; i < 13; i++){
			px.setPixel(hej11, 59, Color.WHITE);
			hej11= hej11 +1;
		}*/
		//Huvud
		int a = -10;
		int b = 80;
		px.setPixel(34+b, 67+a, Color.RED);
		px.setPixel(33+b, 68+a, Color.RED);
		px.setPixel(32+b, 69+a, Color.RED);
		px.setPixel(31+b, 69+a, Color.RED);
		px.setPixel(30+b, 69+a, Color.RED);
		px.setPixel(29+b, 69+a, Color.RED);
		px.setPixel(28+b, 68+a, Color.RED);
		px.setPixel(27+b, 67+a, Color.RED);
		px.setPixel(26+b, 66+a, Color.RED);
		px.setPixel(26+b, 65+a, Color.RED);
		px.setPixel(26+b, 64+a, Color.RED);
		px.setPixel(26+b, 63+a, Color.RED);
		px.setPixel(27+b, 62+a, Color.RED);
		px.setPixel(28+b, 61+a, Color.RED);
		px.setPixel(29+b, 60+a, Color.RED);
		px.setPixel(30+b, 60+a, Color.RED);
		px.setPixel(31+b, 60+a, Color.RED);
		px.setPixel(32+b, 60+a, Color.RED);
		px.setPixel(33+b, 61+a, Color.RED);
		px.setPixel(34+b, 62+a, Color.RED);
		px.setPixel(35+b, 63+a, Color.RED);
		px.setPixel(35+b, 64+a, Color.RED);
		px.setPixel(35+b, 65+a, Color.RED);
		//Ögon
		
		px.setPixel(29+b, 63+a, Color.RED);
		px.setPixel(29+b, 66+a, Color.RED);
		//Mun
		px.setPixel(31+b, 67+a, Color.RED);
		px.setPixel(33+b, 65+a, Color.RED);
		px.setPixel(33+b, 64+a, Color.RED);
		px.setPixel(32+b, 63+a, Color.RED);
		px.setPixel(31+b, 62+a, Color.RED);
		px.setPixel(32+b, 66+a, Color.RED);
		//Diverse
		px.setPixel(35+b, 66+a, Color.RED);
		
		
		
	
		
		
		
		/**}*/
	}

}