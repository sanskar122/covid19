package reg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class regis extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblMobileNo;
	private JLabel lblGender;
	private JLabel lblPhotoIdProof;
	private JTextField textField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regis frame = new regis();
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
	public regis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1135, 673);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 33));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emergency pass\r\n\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(50, 205, 50));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(12, 13, 345, 635);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(721, 160, 265, 31);
		contentPane.add(textField_1);
		
		lblNewLabel_1 = new JLabel("Government of Madhya pradesh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(432, 13, 633, 39);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Fight against COVID-19");
		lblNewLabel_2.setForeground(new Color(255, 99, 71));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(533, 53, 304, 31);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Name of applicant");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(469, 154, 240, 33);
		contentPane.add(lblNewLabel_3);
		
		lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMobileNo.setBounds(469, 214, 240, 33);
		contentPane.add(lblMobileNo);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblGender.setBounds(469, 268, 240, 31);
		contentPane.add(lblGender);
		
		lblPhotoIdProof = new JLabel("Photo ID proof");
		lblPhotoIdProof.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPhotoIdProof.setBounds(469, 322, 240, 33);
		contentPane.add(lblPhotoIdProof);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(721, 214, 265, 31);
		contentPane.add(textField);
		
		comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female);
		comboBox.setBounds(721, 268, 264, 29);
		contentPane.add(comboBox);
		
		setUndecorated(true);
	}
}
