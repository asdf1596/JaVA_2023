package s0508;

public class Student {
	private String name;
	private int grade;
	private float score;
	static int count = 0;
	static String SchoolName = "로봇고";
	static final float PI = (float) 3.1;
	public Student() {
		count++;
	}
	static int getcount() {
		return count;
	}
	//이름을 저장
	void setName(String n) {
		name = n;
	}
	//이름을 리턴
	String getName(){
		return name;
	}
	void setgrade(int g) {
		grade = g;
	}
	int getgrade(){
		return grade;
	}
	void setscore(float s) {
		score = s;
	}
	float getscore(){
		return score;
	}
	void printall() {
		System.out.println(getName() + getgrade() + ":" + getscore());
	}
}