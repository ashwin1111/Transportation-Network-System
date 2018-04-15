import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.sql.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class register extends JFrame {
    
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private Object JOptionPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    int flag;
    private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 1164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");    
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");  
			  
			//step3 create the statement object  
			Statement stma=con.createStatement();    
			//step4 execute query  
			ResultSet rma=stma.executeQuery("select * from autogen");   
			while(rma.next())
			{	
			flag=Integer.parseInt(rma.getString(1)); 
			System.out.println("me"); 
			
			ridee frame=new ridee();
			frame.setVisible(true);
			//step5 close the connection object
			}

			ResultSet rz=stma.executeQuery(" update autogen set customer_id=customer_id+1"); 
			con.close();    
			}catch(Exception y){ System.out.println(y);}  
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-78211967.png"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 29));
		label.setBounds(625, 37, 521, 72);
		contentPane.add(label);
		
		final JLabel label_10 = new JLabel("");
		label_10.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_10.setBounds(602, 232, 120, 22);
		contentPane.add(label_10);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			
				char inp=e.getKeyChar();				
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_10.setText("");
					
				}
				else
				{
					e.consume();
					label_10.setText("Invalid");
				}
			
			}
		});
		textField.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(304, 233, 262, 22);
		contentPane.add(textField);
		
		final JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_5.setBounds(602, 183, 120, 22);
		contentPane.add(label_5);
		
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				textField_1.setToolTipText("ENTER THE NAME");
			}
		});
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();				
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_5.setText("");
					
				}
				else
				{
					e.consume();
					label_5.setText("Invalid");
				}
			}
		});
		textField_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(304, 183, 262, 22);
		
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_1.setBounds(112, 176, 147, 32);

		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Initial");
		label_2.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_2.setBounds(112, 234, 86, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_3.setBounds(112, 269, 135, 22);
		contentPane.add(label_3);
		
		final JLabel label_16 = new JLabel("");
		label_16.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_16.setBounds(612, 267, 120, 22);
		contentPane.add(label_16);
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();				
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_16.setText("");
					
				}
				else
				{
					e.consume();
					label_16.setText("Invalid");
				}
			}
		});
		textField_2.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(304, 271, 262, 22);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("Gender");
		label_4.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_4.setBounds(112, 324, 86, 16);
		contentPane.add(label_4);
		
		final JRadioButton radioButton = new JRadioButton("Male");
		buttonGroup.add(radioButton);
		
		radioButton.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		radioButton.setBounds(304, 302, 77, 50);
		contentPane.add(radioButton);
		
		final JRadioButton radioButton_1 = new JRadioButton("Female");
		buttonGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		radioButton_1.setBounds(385, 302, 97, 50);
		contentPane.add(radioButton_1);
		
		final JLabel label_17 = new JLabel("");
		label_17.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_17.setBounds(641, 392, 97, 21);
		contentPane.add(label_17);
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if(inp>='0' && inp <='9')
				{
					
					label_17.setText("");
					
				}
				else
				{
					e.consume();
					label_17.setText("Invalid");
				}
			
			}
		});
		textField_4.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(304, 392, 262, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(304, 448, 262, 22);
		contentPane.add(textField_5);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.BOLD, 18));
		passwordField.setBounds(304, 501, 262, 22);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		passwordField_1.setBounds(304, 553, 262, 22);
		contentPane.add(passwordField_1);
		
		JLabel label_6 = new JLabel("Mobile Number");
		label_6.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_6.setBounds(112, 393, 200, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Email Id");
		label_7.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_7.setBounds(112, 448, 116, 22);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Password");
		label_8.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_8.setBounds(112, 499, 116, 22);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Confirm Password");
		label_9.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_9.setBounds(112, 554, 174, 16);
		contentPane.add(label_9);
		final JLabel label_19 = new JLabel("");
		label_19.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_19.setBounds(645, 674, 93, 21);
		contentPane.add(label_19);
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if(inp>='0' && inp <='9')
				{
					
					label_19.setText("");
					
				}
				else
				{
					e.consume();
					label_19.setText("Invalid");
				}
			}
		});
		textField_6.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(304, 674, 262, 22);
		contentPane.add(textField_6);
		
		JLabel label_11 = new JLabel("Address :");
		label_11.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_11.setBounds(112, 622, 120, 21);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Door Number");
		label_12.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_12.setBounds(112, 672, 157, 22);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("Street Name");
		label_13.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_13.setBounds(114, 724, 133, 22);
		contentPane.add(label_13);
		final JLabel label_20 = new JLabel("");
		label_20.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_20.setBounds(641, 724, 106, 21);
		contentPane.add(label_20);
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_20.setText("");
					
				}
				else
				{
					e.consume();
					label_20.setText("Invalid");
				}
			
			}
		});
		textField_7.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(304, 724, 262, 22);
		contentPane.add(textField_7);

		final JLabel label_21 = new JLabel("");
		label_21.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_21.setBounds(641, 767, 97, 21);
		contentPane.add(label_21);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_21.setText("");
					
				}
				else
				{
					e.consume();
					label_21.setText("Invalid");
				}
			}
		});
		textField_8.setFont(new Font("SansSerif", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(304, 767, 262, 22);
		contentPane.add(textField_8);
		
		JLabel label_14 = new JLabel("District");
		label_14.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_14.setBounds(112, 759, 116, 34);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("State");
		label_15.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_15.setBounds(112, 816, 106, 22);
		contentPane.add(label_15);
		
		
		final JLabel label_22 = new JLabel("");
		label_22.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_22.setBounds(641, 816, 106, 22);
		contentPane.add(label_22);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char inp=e.getKeyChar();
				if((inp>='A' && inp<='Z')|| (inp>='a' && inp<='z'))
				{
					
					label_22.setText("");
					
				}
				else
				{
					e.consume();
					label_22.setText("Invalid");
				}
			}
		});
		textField_9.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(304, 818, 262, 22);
		contentPane.add(textField_9);
		
		JButton button = new JButton("Submit");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-143162287.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pass1=passwordField.getText();
				String pass2=passwordField_1.getText();
				if(pass1.equals(pass2))
				{
				
					//System.out.println("MES");
						
				//String k=textField_2.getText();
			//	int n=Integer.parseInt(textField_4.getText());
				//String o=textField_5.getText();				
				//String p=passwordField.getText();

				//int r=Integer.parseInt(comboBox.getToolTipText());
				//int s=Integer.parseInt(comboBox_1.getToolTipText());
				//int t=Integer.parseInt(comboBox_2.getToolTipText());
	//			int u=Integer.parseInt(textField_6.getText());
		//		String v=textField_7.getText();
			//	String w=textField_8.getText();
				//String x=textField_9.getText();

								
				
			}
				else
				{
					
					((javax.swing.JOptionPane) JOptionPane).showMessageDialog(contentPane, "Passwords do not match");
				}
				String emailid=textField_5.getText();
				
				
				
					if(!(emailid.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+
	                        "[a-zA-Z0-9_+&*-]+)*@" +
	                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                        "A-Z]{2,7}$")))
					{
						
					{
						((javax.swing.JOptionPane) JOptionPane).showMessageDialog(contentPane, "Invalid EmailID");	
						int flag=0;
					}
					
				}
					else
					{try
					{
						Class.forName("oracle.jdbc.driver.OracleDriver");  
					  
					//step2 create  the connection object
						
					Connection connection=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");
					Statement stt=connection.createStatement();
					//String query=insert into REGIS values(?,?,?,?,?,?);
					PreparedStatement stmt=connection.prepareStatement("insert into CUSTOMERZ values(?,?,?,?,?,?,?,?,?,?,?,?)");
					//stmt.executeQuery("insert into REGIS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				stmt.setInt(1,flag);
					//stmt.setInt(1, textfield.getText());
			stmt.setString(2, textField_1.getText());
				//stmt.setString(2,"000" );
				stmt.setString(3, textField_2.getText());
					stmt.setString(4,textField.getText());
					
					stmt.setString(5,textField_5.getText());
					stmt.setString(6,passwordField.getText());
					stmt.setString(7,textField_6.getText());
					
					stmt.setString(8,textField_7.getText());
					stmt.setString(9,textField_8.getText());
					stmt.setString(10,textField_9.getText());
					
					if(radioButton.isSelected()){
						stmt.setString(11, "M");
					}
					else if(radioButton_1.isSelected()){
						stmt.setString(11, "F");
					}
					
					//stmt.setString(11,"111");
					
					
					stmt.setString(12,textField_4.getText());
					
					
					stmt.execute();
					
					
					
					connection.close();
					}			
	catch(Exception z)
	{ 
		System.out.println(e);
		} 
				
						  
					 

						mainn frame=new mainn();
						frame.setVisible(true);
							
					}

			}});
		button.setBounds(769, 839, 345, 118);
		contentPane.add(button);
		
	
		
		final JLabel label_18 = new JLabel("");
		label_18.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_18.setBounds(645, 453, 116, 22);
		contentPane.add(label_18);
		
		JLabel label_23 = new JLabel("");
		label_23.setFont(new Font("SansSerif", Font.BOLD, 18));
		label_23.setBounds(625, 526, 147, 32);
		contentPane.add(label_23);
		
		textField_3 = new JTextField();
		textField_3.setBounds(304, 623, 262, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		

		
		
		
		

		
		
	}

	private void showMessageDialog(String string) {
		// TODO Auto-generated method stub
		
	}
}
