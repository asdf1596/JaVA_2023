package s0612;

public class leader extends student{
	boolean lead;
	public leader(boolean lead) {
		this.lead = lead;
	}
	leader(String name, String hakbun, boolean lead){
		super(name, hakbun);
		this.lead = lead;
	}
	void isleader(){
		if(lead) {
			System.out.println(name + "학급회장");
		}
		else {
			System.out.println(name + "학생회장 아니다.");
		}
	}
}
