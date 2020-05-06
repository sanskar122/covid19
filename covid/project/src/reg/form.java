package reg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_1;
	private JLabel lblAge;
	private JLabel lblIdProof;
	private JLabel lblReason;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
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
	public form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1023, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter details ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 53));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(50, 205, 50));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(22, 103, 335, 520);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(649, 103, 310, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(649, 164, 310, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(649, 224, 310, 31);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(649, 284, 310, 31);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(649, 343, 310, 31);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(649, 400, 310, 31);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(649, 457, 310, 31);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(649, 514, 310, 31);
		frame.getContentPane().add(textField_7);
		
		lblNewLabel_1 = new JLabel("Name        :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(484, 103, 163, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblAge = new JLabel("Age           :");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAge.setBounds(484, 164, 163, 31);
		frame.getContentPane().add(lblAge);
		
		lblIdProof = new JLabel("Aadhar No. :");
		lblIdProof.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblIdProof.setBounds(484, 224, 163, 31);
		frame.getContentPane().add(lblIdProof);
		
		lblReason = new JLabel("Reason      :");
		lblReason.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblReason.setBounds(484, 284, 163, 31);
		frame.getContentPane().add(lblReason);
		
		label_3 = new JLabel("Name        :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_3.setBounds(484, 343, 163, 31);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("Name        :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_4.setBounds(484, 400, 163, 31);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("Name        :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_5.setBounds(484, 457, 163, 31);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("Name        :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label_6.setBounds(484, 514, 163, 31);
		frame.getContentPane().add(label_6);
		
		JLabel lblNewLabel_2 = new JLabel("Emergency pass");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(50, 205, 50));
		lblNewLabel_2.setBounds(22, 13, 971, 65);
		frame.getContentPane().add(lblNewLabel_2);
		
	}
}
