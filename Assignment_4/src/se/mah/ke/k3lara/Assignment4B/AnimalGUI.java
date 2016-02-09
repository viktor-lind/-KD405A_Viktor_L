package se.mah.ke.k3lara.Assignment4B;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtAnimals = new JTextArea();
		txtAnimals.setBounds(0, 0, 428, 244);
		contentPane.add(txtAnimals);
		ArrayList<Animal> Animals = new ArrayList<Animal>();
		Animals.add(new Dog("Canis", 34, true, "Hund"));
		Animals.add(new Snake("Vipera berus", true, "Huggorm"));
		Animals.add(new Cat("Felis silvestris catus", 2, 9, "Frasse"));
		Animals.add(new Dog("Canis", 2, false, "Sven"));
		Animals.add(new Snake("Hydrus", false, "Carl"));
		Animals.add(new Cat("Felis catus", 100, 1, "George"));
		for(int i = 0; i < Animals.size(); i++){
		System.out.println(Animals.get(i).getInfo());
		txtAnimals.append(Animals.get(i).getInfo() + "\n");
		}
		
	}
}
