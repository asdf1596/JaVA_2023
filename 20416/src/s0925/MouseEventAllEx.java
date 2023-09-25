package s0925;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener {

	JLabel lb = new JLabel("MOVE ME");
	JPanel p = new JPanel();

	public MouseEventAllEx(){
		add(p);
		p.add(lb);
		p.setLayout(null);
		lb.setSize(80,20);
		lb.setLocation(100,80);
		lb.setFont(new Font("Arial", Font.PLAIN, 10));
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 드래그되는 동안 ( " + e.getX() + "," + e.getY() + " )");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 움직이는 동안 ( " + e.getX() + "," + e.getY() + " )");
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getClickCount() == 2) {
			lb.setLocation(e.getX(), e.getY());
			setTitle("마우스가 더블클릭되는 순간 ( " + e.getX() + "," + e.getY() + " )");
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 눌러진 위치 ( " + e.getX() + "," + e.getY() + " )");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 놓여진 위치 ( " + e.getX() + "," + e.getY() + " )");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.cyan);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		p.setBackground(Color.yellow);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventAllEx(); 
	}

}
