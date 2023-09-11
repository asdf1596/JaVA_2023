package s0911;
import javax.swing.*;
import java.awt.*;
public class HelloSwing extends JFrame {
	HelloSwing(){
		//JPanel p = new JPanel(new BorderLayout());
		//p.setLayout(new FlowLayout());
		setLayout(null);
		
		//p.setBackground(Color.MAGENTA);
		//add(p);
		
		JButton bt1 = new JButton("버튼1");
		bt1.setSize(70,40);
		bt1.setLocation(10,30);
		//JButton bt2 = new JButton("버튼2");
		//JButton bt3 = new JButton("버튼3");
		//JButton bt4 = new JButton("버튼4");
		//JButton bt5 = new JButton("버튼5");
		//JButton bt6 = new JButton("버튼6");
		//JButton bt7 = new JButton("버튼7");
		add(bt1);
		//p.add(bt2, BorderLayout.NORTH);
		//p.add(bt3, BorderLayout.WEST);
		//p.add(bt4, BorderLayout.CENTER);
		//p.add(bt5, BorderLayout.SOUTH);
		//p.add(bt6);
		//p.add(bt7);
		
		setTitle("안녕, 스윙!");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloSwing();
	}

}
