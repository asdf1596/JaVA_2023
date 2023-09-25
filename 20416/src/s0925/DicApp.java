package s0925;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DicApp extends JFrame implements ActionListener {

	private JTextField eng = new JTextField(9);
	private JTextField kor = new JTextField(9);
	private JButton SaveBtn = new JButton("저장");
	private JButton SearchBtn = new JButton("검색");
	private JLabel countLabel = new JLabel("0");
	private JTextArea ta = new JTextArea(7, 25);
	private JScrollPane sp = new JScrollPane(ta);

	private HashMap<String, String> dic = new HashMap<String, String>();

	public DicApp() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);

		SaveBtn.setBackground(Color.YELLOW);
		SearchBtn.setBackground(Color.GREEN);

		p.add(new JLabel("영어"));
		p.add(eng);
		p.add(new JLabel("한글"));
		p.add(kor);
		p.add(SaveBtn);
		p.add(SearchBtn);
		p.add(countLabel);
		p.add(sp);
		
		SaveBtn.addActionListener(this);
		SearchBtn.addActionListener(this);
		setTitle("단어 사전 만들기");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DicApp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == SaveBtn) {
			String eText = eng.getText();
			String kText = kor.getText();
			
			if(eText.length() == 0 || kText.length() == 0) {
				ta.append("삽입실패(" + eText + "," + kText + ")\n" );
				return;
			}
			if(dic.containsKey(eText)) {
				ta.append("변경(" + eText + "," + kText + ")\n");
				dic.put(eText,  kText);
				}
			else {
				ta.append("삽입(" + eText + "," + kText + ")\n");
				dic.put(eText, kText);
				
				int count = Integer.parseInt(countLabel.getText());
				countLabel.setText(Integer.toString(count+1));
			}
		}
		else if(e.getSource() == SearchBtn) {
			String kText = dic.get(eng.getText());
			kor.setText(kText);
		}
	}

}
