package s0918;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompButton extends JFrame implements ActionListener{

	JButton btnY, btnP;
	JPanel p;
	
	CompButton(){
		p = new JPanel();
		add(p);
		btnY = new JButton("노란색");
		btnP = new JButton("핑크색");
		p.add(btnY);
		p.add(btnP);
		
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		setTitle("버튼 예제");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CompButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnY)
			p.setBackground(Color.YELLOW);
		else if(e.getSource() == btnP)
			p.setBackground(Color.PINK);
		
	}

}
