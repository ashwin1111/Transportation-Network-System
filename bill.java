import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;


public class bill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill frame = new bill(5,40);
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
	public bill(int cz,int az) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1331, 1102);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\proxy_form (6).png"));
		label.setBounds(551, 52, 715, 105);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(530, 509, 227, 22);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Amount");
		label_1.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_1.setBounds(239, 509, 156, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Distance");
		label_2.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_2.setBounds(239, 611, 138, 25);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(530, 614, 227, 22);
		contentPane.add(textField_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-27969311.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				support frame=new support();
				frame.setVisible(true);
			}
		});
		button.setBounds(920, 831, 177, 83);
		contentPane.add(button);
		
		JLabel lblBillNumber = new JLabel("Bill Number");
		lblBillNumber.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblBillNumber.setBounds(239, 308, 177, 36);
		contentPane.add(lblBillNumber);
		
		JLabel lblRideNumber = new JLabel("Ride Number");
		lblRideNumber.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblRideNumber.setBounds(239, 417, 138, 36);
		contentPane.add(lblRideNumber);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_3.setBounds(530, 317, 227, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_4.setBounds(530, 426, 227, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		table = new JTable();
		table.setBounds(141, 156, 1, 1);
		contentPane.add(table);
		textField_1.setText(String.valueOf(cz));
		textField.setText(String.valueOf(az));
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");    
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();    
			//step4 execute query  
			ResultSet ram=stmt.executeQuery("select * from autogen"); 
	//		ResultSet rz=stmt.executeQuery("select * from customerz WHERE C_PASSWORD='" + pass + "' "); 
			//System.out.println(rs.getString(2));  
			while(ram.next())
			{	
				 textField_3.setText(ram.getString(3));
	             textField_4.setText(ram.getString(2));
			System.out.println("me"); 
			
			ridee frame=new ridee();
			frame.setVisible(true);
			//step5 close the connection object
			}
			ResultSet rz=stmt.executeQuery(" update autogen set ride_no=ride_no+1,trans_no=trans_no+1"); 
			con.close();    
			}catch(Exception y){ System.out.println(y);}
		
		
	}
}
