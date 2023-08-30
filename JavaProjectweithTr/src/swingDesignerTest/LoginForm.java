package swingDesignerTest;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {
	private JTextField txtUserName;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		getContentPane().setBackground(new Color(128, 128, 192));
		setTitle("Login Form");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginForm.class.getResource("/gui/icon.png")));
		getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setFont(new Font("Arial", Font.PLAIN, 11));
		lblUserName.setForeground(new Color(0, 0, 0));
		lblUserName.setBounds(153, 41, 73, 13);
		getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPassword.setBounds(153, 91, 73, 13);
		getContentPane().add(lblPassword);
		
		txtUserName = new JTextField();
		txtUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtUserName.setBounds(265, 38, 96, 19);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(265, 88, 96, 19);
		getContentPane().add(txtpassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logic successful");
				
			}
		});
		btnLogin.setBackground(new Color(0, 255, 255));
		btnLogin.setBounds(153, 148, 73, 33);
		getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(0, 255, 255));
		btnCancel.setBounds(265, 148, 73, 33);
		getContentPane().add(btnCancel);
	}
}
