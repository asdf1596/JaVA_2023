package swingtalk;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AppMain extends JFrame{
	JTextField txt_login;
	JButton btn_login;
	JLabel profile;
	
	public AppMain(){
		setTitle("RobotChat Login");
		setSize(320,600);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(254,229,0));
		
		txt_login = new JTextField("20416 지민철");
		btn_login = new JButton("확인");
		
		ImageIcon img = new ImageIcon("img/다운로드.jpg");
		Image imag = img.getImage();
		Image chimg = imag.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
		ImageIcon chicon = new ImageIcon(chimg);
		profile = new JLabel(chicon);
		JLabel status = new JLabel("\r\n"
				+ "java应该消失");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt_login.setBounds(50, 400, 200, 30);
		btn_login.setBounds(50, 440, 200, 30);
		profile.setBounds(70, 160, 160, 160);
		status.setBounds(70, 330, 160, 20);
		
		
		panel.add(profile);
		panel.add(status);
		panel.add(btn_login);
		panel.add(txt_login);
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(Color.YELLOW);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppMain();

	}
}
