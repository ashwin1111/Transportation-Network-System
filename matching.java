import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class matching extends JFrame {
	   int cz;
			int az;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				try {
					matching frame = new matching(0);
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
	public matching(int idd) {
		System.out.println("MAtch"+idd);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 1391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-75421042.png"));
		label.setBounds(739, 13, 384, 93);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(424, 201, 271, 22);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Driver Name");
		label_1.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_1.setBounds(136, 207, 151, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Driver Phone Number");
		label_2.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_2.setBounds(136, 285, 223, 16);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(424, 279, 271, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(424, 378, 271, 22);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Car Model");
		label_3.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_3.setBounds(136, 379, 144, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Car Number");
		label_4.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_4.setBounds(136, 467, 144, 16);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(424, 461, 271, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(424, 139, 271, 22);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Ride Number");
		label_5.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_5.setBounds(136, 133, 138, 31);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Pickup Location");
		label_6.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_6.setBounds(136, 547, 177, 16);
		contentPane.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(424, 528, 271, 59);
		contentPane.add(textField_5);
		
		JLabel label_7 = new JLabel("Drop Location");
		label_7.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_7.setBounds(136, 628, 151, 22);
		contentPane.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(424, 733, 272, 22);
		contentPane.add(textField_6);
		
		JLabel label_8 = new JLabel("Estimated Amount");
		label_8.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_8.setBounds(136, 727, 204, 31);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Distance");
		label_9.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_9.setBounds(136, 835, 144, 16);
		contentPane.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(424, 832, 271, 22);
		contentPane.add(textField_7);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-14591308.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				bill frame=new bill(cz,az);
				frame.setVisible(true);
			}
		});
		button.setBounds(758, 906, 384, 93);
		contentPane.add(button);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_10.setBounds(424, 616, 271, 59);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");    
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();   
			
			ResultSet ry=stmt.executeQuery("select * from autogen"); 
			{
			while(ry.next())
			textField_4.setText(ry.getString(2));
			}
			ResultSet rs=stmt.executeQuery("select * from driver WHERE driver_id='" + idd + "' "); 
			//ResultSet rz=stmt.executeQuery("select * from customerz WHERE C_PASSWORD='" + pass + "' "); 
			//System.out.println(rs.getString(2));  
			while(rs.next())
			{	
			System.out.println(rs.getString(4)); 
			System.out.println("me"); 
			textField.setText(rs.getString(3));
			textField_1.setText(rs.getString(2));
			
			
			//step5 close the connection object
			}
			ResultSet rv=stmt.executeQuery("select * from vehicle WHERE driver_id='" + idd + "' ");
			while(rv.next())
			{
				textField_2.setText(rv.getString(3));
				textField_3.setText(rv.getString(1));
				
			}
			ResultSet rxx=stmt.executeQuery("select * from ridezz WHERE driver_id='" + idd + "' ");
			String pick="Hopes";
			String drop="Sitra";
			
			while(rxx.next())
			{
				pick=rxx.getString(1);
				drop=rxx.getString(2);
				textField_5.setText(rxx.getString(1));
				textField_10.setText(rxx.getString(2));
			
			}
			System.out.println("ooyi");
			System.out.println(pick);
			
			ResultSet rq=stmt.executeQuery("select * from DISTANCE8 WHERE (PICKUP_LOCATION='" + pick + "' and DROP_LOCATION='" + drop + "')"); 
			while(rq.next())
			{
				textField_7.setText(rq.getString(4));
				 cz=Integer.parseInt(rq.getString(4));
				az=cz*8;
				textField_6.setText(String.valueOf(az));
			}
			
			con.close();    
			}catch(Exception y){ System.out.println(y);}  
			  
	}
}
