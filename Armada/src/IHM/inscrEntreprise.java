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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class inscrEntreprise extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inscrEntreprise frame = new inscrEntreprise();
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
	public inscrEntreprise() {
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
		
		JLabel lblNewLabel = new JLabel("Inscrivez une entreprise");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(124, 10, 220, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nom de l'entreprise");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(106, 70, 131, 25);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(242, 70, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Repr\u00E9sentant");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(145, 100, 97, 25);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 100, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
	
		JLabel lblNewLabel_4 = new JLabel("Mot de passe");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(145, 130, 104, 25);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(242, 130, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmer le mot de passe");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(60, 160, 196, 25);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(242, 160, 96, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new pageInscription().setVisible(true);
			}
		});
		btnNewButton.setBounds(121, 214, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Valider");
		btnNewButton_1.setBounds(221, 214, 85, 21);
		panel.add(btnNewButton_1);
	}

}
