package s0619_2;

public class Student extends Person{
	boolean online;

	@Override
	void printInfo() {
		super.printInfo();
		System.out.print(name + "은 학생이며 현재 ");
		if(online) {
			System.out.println("온라인 수업 중입니다.");
		}else {
			System.out.println("등교 수업 중입니다.");
		}
	}
	
}
