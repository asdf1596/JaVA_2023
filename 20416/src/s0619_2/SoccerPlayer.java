package s0619_2;

public class SoccerPlayer extends Person{
	String teamName;

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(name+"는 "+teamName+"팀 축구선수입니다.");
	}
	
}
