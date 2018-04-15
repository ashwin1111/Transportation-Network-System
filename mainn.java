import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;


public class mainn extends JFrame {
	
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainn frame = new mainn();
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
	public mainn() {
	
	
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1361, 812);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToTransportation = new JLabel("Welcome to Transportation Network");
		lblWelcomeToTransportation.setFont(new Font("Showcard Gothic", Font.ITALIC, 42));
		lblWelcomeToTransportation.setBounds(518, 74, 884, 60);
		contentPane.add(lblWelcomeToTransportation);
		
		JButton btnLogin = new JButton("");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginn frame=new loginn();
				frame.setVisible(true);
			}
		});
		btnLogin.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-66311128.gif"));
		btnLogin.setBounds(209, 516, 323, 89);
		contentPane.add(btnLogin);
		
		JButton btnSignUp = new JButton("");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register frame=new register();
				frame.setVisible(true);
				
			}
		});
		btnSignUp.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-4969115.gif"));
		btnSignUp.setBounds(784, 516, 250, 65);
		contentPane.add(btnSignUp);
		
		JButton btnAbout = new JButton("");
		btnAbout.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-28621860.gif"));
		btnAbout.setBounds(1287, 516, 194, 73);
		contentPane.add(btnAbout);
	}
}
