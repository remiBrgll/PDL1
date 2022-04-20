package IHM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class accueilPart {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueilPart window = new accueilPart();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public accueilPart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Mon compte");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(130, 64, 200, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Se deconnecter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(284, 10, 152, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modifier mon compte");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_2.setBounds(130, 149, 200, 33);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Supprimer mon compte");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBounds(130, 192, 200, 33);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Laissez-passer");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(130, 107, 200, 32);
		panel.add(btnNewButton_4);
	}

}
