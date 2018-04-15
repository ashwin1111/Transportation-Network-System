import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;


public class support extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					support frame = new support();
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
	public support() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1342, 1310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-20310687.png"));
		label.setBounds(712, 45, 531, 89);
		contentPane.add(label);
		
		JLabel label_4 = new JLabel("Rate");
		label_4.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_4.setBounds(220, 652, 97, 22);
		contentPane.add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("SansSerif", Font.PLAIN, 18));
		spinner.setBounds(498, 654, 30, 22);
		contentPane.add(spinner);
		
		JLabel label_5 = new JLabel("How was your Ride?");
		label_5.setIcon(new ImageIcon("H:\\Studies\\java project\\proxy_form (7).png"));
		label_5.setBounds(548, 277, 829, 164);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Profeessional Driver");
		label_6.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_6.setBounds(220, 714, 239, 30);
		contentPane.add(label_6);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setFont(new Font("SansSerif", Font.PLAIN, 18));
		checkBox.setBounds(498, 714, 113, 25);
		contentPane.add(checkBox);
		
		JLabel label_7 = new JLabel("Smooth Driving");
		label_7.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_7.setBounds(220, 757, 215, 30);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Correct Route");
		label_8.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_8.setBounds(220, 800, 192, 30);
		contentPane.add(label_8);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setFont(new Font("SansSerif", Font.PLAIN, 18));
		checkBox_1.setBounds(498, 800, 113, 25);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setFont(new Font("SansSerif", Font.PLAIN, 18));
		checkBox_2.setBounds(498, 757, 113, 25);
		contentPane.add(checkBox_2);
		
		JLabel label_9 = new JLabel("Time Management");
		label_9.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_9.setBounds(220, 843, 192, 22);
		contentPane.add(label_9);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setFont(new Font("SansSerif", Font.PLAIN, 18));
		checkBox_3.setBounds(498, 840, 113, 25);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		checkBox_4.setBounds(498, 890, 113, 25);
		contentPane.add(checkBox_4);
		
		JLabel label_10 = new JLabel("Good Behaviour");
		label_10.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		label_10.setBounds(220, 890, 192, 22);
		contentPane.add(label_10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("H:\\Studies\\java project\\coollogo_com-131471545.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginn frame=new loginn();
				frame.setVisible(true);
			}
		});
		button.setBounds(735, 904, 236, 61);
		contentPane.add(button);
	}

}
