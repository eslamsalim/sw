import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class allakfeen_Signup {

	private JFrame frmallakFeenSignup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allakfeen_Signup window = new allakfeen_Signup();
					window.frmallakFeenSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public allakfeen_Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmallakFeenSignup = new JFrame();
		frmallakFeenSignup.setBackground(new Color(245, 245, 245));
		frmallakFeenSignup.getContentPane().setBackground(new Color(245, 245, 245));
		frmallakFeenSignup.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 0, 0);
		frmallakFeenSignup.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Premium User");
		btnNewButton_1.setIcon(new ImageIcon("E:\\fci 3\\3rd\\first term\\SW Engineering\\rsz_premium.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
					
				frmallakFeenSignup.dispose();
				allakfeen_Signup_PremiumUser p=new allakfeen_Signup_PremiumUser();
		
				p.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(115, 97, 212, 55);
		frmallakFeenSignup.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Normal User");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmallakFeenSignup.dispose();
				allakfeen_Signup_NormalUser NU=new allakfeen_Signup_NormalUser();
		
				NU.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("E:\\fci 3\\3rd\\first term\\SW Engineering\\rsz_user.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setBounds(115, 190, 212, 55);
		frmallakFeenSignup.getContentPane().add(btnNewButton_2);
		frmallakFeenSignup.setTitle("2allak feen Signup");
		frmallakFeenSignup.setBounds(100, 100, 450, 387);
		frmallakFeenSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
