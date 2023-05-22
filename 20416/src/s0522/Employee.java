package s0522;

public class Employee {
	private String name;
	private int no;
	private int age;
	
	Employee(){};
	Employee(String name, int no, int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	String getname() {
		return name;
	}
	int getno() {
		return no;
	}
	int getage() {
		return age;
	}
	void setname(String name) {
		this.name = name;
	}
	void setno(int no) {
		this.no = no;
	}
	void setage(int age) {
		this.age = age;
	}
	//정보 출력하는 메소드
	@Override
	public String toString() {
		return "이름: " + name + " 번호:" + no + "  나이:" + age;
	}

}
