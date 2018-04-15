import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

import java.awt.Desktop;
import java.net.URI;
public class ridee extends JFrame {
	
	private JPanel contentPane;
	int idd,nn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws Exception {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ridee frame = new ridee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		String source="Hopecollege+coimbatore";
		String destination="ukkadam";
	
			Desktop d=Desktop.getDesktop();
			d.browse(new URI("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations="+ destination +"&departure_time=1541202457&traffic_model=best_guess&key=AIzaSyAFHbOtWE6m5VAgboDMdbpl0UDyvkpW9hY"));
	}

	/**
	 * Create the frame.
	 */
	public ridee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1419, 1101);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-255021807.gif"));
		label.setBounds(822, 43, 180, 79);
		contentPane.add(label);
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textArea.setBounds(368, 271, 378, 72);
		contentPane.add(textArea);
		
		JLabel label_1 = new JLabel("Pickup Location");
		label_1.setFont(new Font("Lucida Fax", Font.BOLD, 21));
		label_1.setBounds(115, 292, 209, 25);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Drop Location");
		label_2.setFont(new Font("Lucida Fax", Font.BOLD, 21));
		label_2.setBounds(115, 408, 180, 25);
		contentPane.add(label_2);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		textArea_1.setBounds(368, 390, 378, 72);
		contentPane.add(textArea_1);
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"mini car", "micro car", "auto ", "sedan"}));
		comboBox.setFont(new Font("SansSerif", Font.PLAIN, 18));
		comboBox.setBounds(368, 548, 200, 22);
		contentPane.add(comboBox);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\proxy_form (4).png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{  
					String loc =textArea.getText();
					System.out.println("hey");
					//step1 load the driver class  
					Class.forName("oracle.jdbc.driver.OracleDriver");    
					//step2 create  the connection object  
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashwin");  
					  
					//step3 create the statement object  
					Statement stmt=con.createStatement();    
					//step4 execute query
					ResultSet rs=stmt.executeQuery("select * from driver WHERE D_LOCATION='" + loc + "' "); 
			//		ResultSet rz=stmt.executeQuery("select * from customerz WHERE C_PASSWORD='" + pass + "' "); 
					//System.out.println(rs.getString(2));  
					
					while(rs.next())
					{	
					System.out.println(rs.getString(3)); 
					System.out.println(loc); 
					idd=rs.getInt(1);
					System.out.print(idd);
					ridee frame=new ridee();
					frame.setVisible(true);
					//step5 close the connection object
					}
					
					ResultSet ry=stmt.executeQuery("select * from autogen"); 
					{
					while(ry.next())
						nn=ry.getInt(2);
		//			textField_4.setText(ry.getString(2));
					}
					
					PreparedStatement stms=con.prepareStatement("insert into RIDEZZ values(?,?,?,?,?)");
					String cx=(String)comboBox.getSelectedItem();
					stms.setString(1, textArea.getText());
					stms.setString(2, textArea_1.getText());
					//source=textArea.getText();
					//destination=textArea_1.getText();
					stms.setInt(3,nn);
					stms.setInt(5,idd);
					stms.setString(4, cx);
					System.out.println("EE"+cx);

					System.out.println("EE"+nn);
					stms.execute();
					con.close();    
					}catch(Exception y){ System.out.println(y);}  
				
				matching frame=new matching(idd);
				frame.setVisible(true);
			}
		});
		button.setBounds(494, 740, 735, 131);
		contentPane.add(button);
		
		JLabel lblVehicleType = new JLabel("Vehicle Type");
		lblVehicleType.setFont(new Font("Lucida Fax", Font.BOLD, 21));
		lblVehicleType.setBounds(115, 539, 209, 34);
		contentPane.add(lblVehicleType);
		
		
		JButton btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogout.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-193202018.gif"));
		btnLogout.setBounds(1324, 125, 451, 105);
		contentPane.add(btnLogout);
	}
}
