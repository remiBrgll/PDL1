package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Organisateur;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class application extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private String IdOrganisateur = "orga";
	private String MdpOrganisateur = "123";
	
	private String IdParticipant = "participant";
	private String MdpParticipant = "123";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application frame = new application();
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
	
	public application() {
		getContentPane().setLayout(null);
		
	/*	JPanel panel = new JPanel();
		panel.setBounds(44, 60, 357, 148);
		getContentPane().add(panel);
		panel.setLayout(null);	*/
		
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 60, 610, 342);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.setVisible(true);
		
	//------------------------ page de connexion-----------------------------------------------
	//-----------------------------------------------------------------------------------------
	
	/*JPanel panel = new JPanel();
		panel.setBounds(10, 10, 651, 380);
		contentPane.add(panel);
		panel.setLayout(null);
		*/
		
		
		JLabel lblNewLabel = new JLabel("Armada Rouen 2023");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(178, 10, 391, 90);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(243, 158, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(243, 232, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Identifiant");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(250, 132, 75, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mot de passe");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(250, 187, 89, 35);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SE CONNECTER");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(225, 282, 132, 40);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				if(textField.getText().equals(IdOrganisateur)&&textField_1.getText().equals(MdpOrganisateur))
				{
					//Organisateur orga = new Organisateur(1,textField.getText(),textField_1.getText());
					dispose();
				
					System.out.println("C'est bon");
					
				}
				
			
					
				
			}
		});
		
		
		
		
		JButton btnNewButton_1 = new JButton("INSCRIPTION");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new pageInscription().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(443, 282, 108, 40);
		panel.add(btnNewButton_1);
		

		
		}
	}

