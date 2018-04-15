import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.*;


public class loginn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginn frame = new loginn();
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
	public loginn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-249851568.png"));
		label.setBounds(832, 76, 209, 77);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(545, 320, 286, 50);
		contentPane.add(textField);
		
		JLabel lblEmailphoneNumber = new JLabel("Email/Phone Number");
		lblEmailphoneNumber.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblEmailphoneNumber.setBounds(189, 320, 247, 50);
		contentPane.add(lblEmailphoneNumber);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_2.setBounds(189, 490, 219, 36);
		contentPane.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.BOLD, 18));
		passwordField.setBounds(545, 483, 286, 50);
		contentPane.add(passwordField);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\proxy_form (3).png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email=textField.getText();
			    String pass=passwordField.getText();
				try{  
					//step1 load the driver class  
					Class.forName("oracle.jdbc.driver.OracleDriver");    
					//step2 create  the connection object  
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");  
					  
					//step3 create the statement object  
					Statement stmt=con.createStatement();    
					//step4 execute query  
					ResultSet rs=stmt.executeQuery("select * from customerz WHERE (C_EMAIL='" + email + "' or C_MOBILE='" + email + "')  and C_PASSWORD='" + pass + "' "); 
			//		ResultSet rz=stmt.executeQuery("select * from customerz WHERE C_PASSWORD='" + pass + "' "); 
					//System.out.println(rs.getString(2));  
					while(rs.next())
					{	
					System.out.println(rs.getString(4)); 
					System.out.println("me"); 
					
					ridee frame=new ridee();
					frame.setVisible(true);
					//step5 close the connection object
					}
					con.close();    
					}catch(Exception y){ System.out.println(y);}  
					  
					}  
		});
		button.setBounds(792, 663, 233, 100);
		contentPane.add(button);
	}

}
