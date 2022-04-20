package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class pageInscription extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageInscription frame = new pageInscription();
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
	public pageInscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSCRIPTION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(142, 10, 146, 30);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Participant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrParticipants().setVisible(true);
			}
		});
		btnNewButton.setBounds(142, 64, 117, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Famille d'accueil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrFamilleAccueil().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(142, 190, 117, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bateau");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrBateau().setVisible(true);	
			}
		});
		btnNewButton_2.setBounds(142, 95, 117, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Commer\u00E7ant");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrCommercants().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(142, 128, 117, 21);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Entreprise");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrEntreprise().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(142, 159, 117, 21);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("D\u00E9l\u00E9gation");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new inscrDelegation().setVisible(true);
			}
		});
		btnNewButton_5.setBounds(142, 222, 117, 21);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Retour");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new application().setVisible(true);
			}
		});
		btnNewButton_6.setBounds(10, 242, 85, 21);
		panel.add(btnNewButton_6);
	}

}
