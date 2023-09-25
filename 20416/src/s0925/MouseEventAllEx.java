package s0925;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener {

	JLabel lb = new JLabel("MOVE ME");
	JPanel p = new JPanel();

	public MouseEventAllEx(){
		add(p);
		p.add(lb);
		lb.setBounds(100,80,80,20);
		lb.setFont(new Font("Arial", Font.PLAIN, 10));
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventAllEx(); 
	}

}
