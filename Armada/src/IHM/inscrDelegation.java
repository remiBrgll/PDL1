package IHM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inscrDelegation extends JFrame {

	private JPanel contentPane;
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
					inscrDelegation frame = new inscrDelegation();
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
	public inscrDelegation() {
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
		
		JLabel lblNewLabel = new JLabel("Inscriver une d\u00E9l\u00E9gation");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(120, 10, 238, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pays");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(160, 60, 45, 25);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(195, 60, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Repr\u00E9sentant");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(102, 81, 90, 33);
		panel.add(lblNewLabel_2);
		textField_1 = new JTextField();
		textField_1.setBounds(195, 90, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("Ann\u00E9e");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(145, 120, 45, 13);
		panel.add(lblNewLabel_3);
		textField_2 = new JTextField();
		textField_2.setBounds(195, 120, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mot de passe");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(98, 153, 104, 25);
		panel.add(lblNewLabel_4);
		textField_2 = new JTextField();
		textField_2.setBounds(195, 153, 96, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmer le mot de passe");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(13, 183, 196, 25);
		panel.add(lblNewLabel_5);
		textField_3 = new JTextField();
		textField_3.setBounds(195, 183, 96, 19);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(273, 218, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new pageInscription().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(120, 218, 85, 21);
		panel.add(btnNewButton_1);
	}
}
