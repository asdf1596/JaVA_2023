package s0522;

public class Student {
	private String name="이름없음";
	private int grade;
	
	
	static int count = 0;
	static String SchoolName = "로봇고";
	
	
	Student(){ //생성자
		count++ ; //생성할때마다 학생수를 증가시키려는 목적
	}
	Student (String name, int grade) {
		this();
		this.name = name;
		this.grade = grade;
	}
	//count 값을 리턴해주는 메소드
	static int getCount() {
		return count;
	}
	

	//이름을 저장
	void setName(String n) {
		name = n;
	}
	
	//이름을 리턴
	String getName(){
		return name ; 
	}
	
	//학년을 저장
	void setGrade( int g) {
		grade = g;
	}
	
	//학년을 리턴
	int getGrade() {
		return grade;
	}
	
	void print() {//모든 정보 출력
		System.out.println(count + "번째 학생 이름은 "+  getName() +"이고 "+ getGrade() + "학년");
	}
	
}








