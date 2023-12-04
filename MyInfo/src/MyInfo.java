import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyInfo  extends JFrame implements ActionListener, ListSelectionListener{
	String[] year = {"2006", "2007","2008","2009"};
	Integer[] month = new Integer[12];
	String[] day = new String[31];
	JPanel p0;
	
	Font defaultFont =  new Font("굴림", Font.BOLD,20);
	
	JList<String> listYear = new JList<>(year);
	JList<Integer> listMonth = new JList<Integer>(month);
	JList<String> listDay = new JList<>(day);
	
	JRadioButton radio_male = new JRadioButton("남자");
	JRadioButton radio_female = new JRadioButton("여자");
	
	JLabel sample = new JLabel("20416지민철");
	
	JCheckBox check_agree = new JCheckBox("개인정보 제공에 동의합니다.");
	
	JButton btnOK = new JButton("확인");
	JButton btnNO = new JButton("취소");
	
	//이 함수는 기본 화면 디자인을 만들어 줍니다. 건들이지 마세요. 
	private void 선생님_제공_기초화면() {
		setTitle("수행평가 연습");
		setBounds(0, 0, 450, 500);
		setTitle("수행평가 연습");

		p0 = new JPanel(null);
		add(p0);
		
		//월, 일 표현에는 스크롤이 필요합니다.
		JScrollPane scrollPane1 = new JScrollPane(listMonth);
		JScrollPane scrollPane2 = new JScrollPane(listDay);

		// 리스트
		listYear.setBounds(10, 30, 90, 160);
		scrollPane1.setBounds(120, 30, 90, 160);
		scrollPane2.setBounds(220, 30, 90, 160);

		//라디오 버튼 생성
        radio_male.setBounds(320, 30, 80, 50);
        radio_female.setBounds(320, 80, 80, 50);
	    radio_male.setFont(defaultFont);
	    radio_female.setFont(defaultFont);
	    radio_male.setSelected(true);
//	    ButtonGroup radioGroup = new ButtonGroup();
//        radioGroup.add(radio_male);
//        radioGroup.add(radio_female);
	    
		//라벨
		sample.setBounds(10, 180, 500, 50);
		sample.setFont(defaultFont);

		//CheckBox
		check_agree.setBounds(10, 300, 500, 50);
		check_agree.setFont(defaultFont);
		
		//버튼 2개
		btnOK.setBounds(100, 360, 80, 20);
		btnNO.setBounds(200, 360, 80, 20);
		//모든 항목 패널에 더하기
		
		p0.add(listYear);
		p0.add(scrollPane1);
		p0.add(scrollPane2);
        p0.add(radio_male);
        p0.add(radio_female);
		p0.add(sample);
		p0.add(check_agree);
		p0.add(btnOK);
		p0.add(btnNO);
		

		//화면이 열리면 첫 항목 강제 선택 
		listYear.setSelectedIndex(0);
		listMonth.setSelectedIndex(0);
		listDay.setSelectedIndex(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyInfo();
		
	}
	MyInfo(){
		
		Integer i = 0;
		for(i=0;i<12;i++){
			month[i] = i+1;
		}
//		for(i=0;i<31;i++){
//			day[i] = String.valueOf(i+1);
//		}
		for(i=0;i<31;i++){
			day[i] = Integer.toString(i+1);
		}
		
		ButtonGroup ButtonGroup = new ButtonGroup();
        ButtonGroup.add(radio_male);
        ButtonGroup.add(radio_female);
        
        //화면 디자인 
		선생님_제공_기초화면();
		listYear.addListSelectionListener(this);
		listMonth.addListSelectionListener(this);
		listDay.addListSelectionListener(this);
		
		radio_female.addActionListener(this);
		radio_male.addActionListener(this);
		
		btnOK.addActionListener(this);
		btnNO.addActionListener(this);
		
		setVisible(true);
//		btnOK.addActionListener(this);
//		btnNO.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource()==btnOK) {
//			if(check_agree == null) {
//				JOptionPane.showMessageDialog(null, "개인정보 제공에 동의해주세요.");
//			}else {
//				setVisible(false);
//			}
//		}
//		if(e.getSource()==btnNO) {
//			setVisible(false);
//		}
		//선택이 바뀔떄마다 변경된 값을 sample에 표시
		changeSample();
		//5. 확인버튼 취소버튼
		if (e.getSource() == btnOK) {
	        if (!check_agree.isSelected()) {
	            JOptionPane.showMessageDialog(null, "개인정보 제공에 동의해주세요.");
	        } else {
//	            setVisible(false);
	        	dispose();
	        }
	    }
	    if (e.getSource() == btnNO) {
//	        setVisible(false);
	    	dispose();
	    }
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		changeSample();
	}
	private void changeSample() {
//		String gender = "";
//	    if (radio_male.isSelected()) {
//	        gender = "남자";
//	    } else if (radio_female.isSelected()) {
//	        gender = "여자";
//	    }
//	    String selectedYear = listYear.getSelectedValue();
//	    Integer selectedMonth = listMonth.getSelectedValue();
//	    String selectedDay = listDay.getSelectedValue();
		String y = listYear.getSelectedValue().toString();
		Integer m = listMonth.getSelectedValue();
		String d = listDay.getSelectedValue().toString();
		
		String info = "생년월일:"+y+"년"+m+"월"+d+"일";
		
		if (radio_male.isSelected()) {
	        info = "성별:" + "남자"+info;
	    } else if (radio_female.isSelected()) {
	    	info = "성별:" + "여자"+info;
	    }

//	    sample.setText("성별:"+gender + " 생년월일:"+y +"년"+ m +"월"+ d +"일");
		sample.setText(info);
	}

}
