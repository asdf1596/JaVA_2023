package s0612;

public class student {
	String name;
	String hakbun;
	String phone;
	student(){}
	student(String name, String hakbun){
		this.name = name;
		this.hakbun = hakbun;
	}
	void sleep() {
		System.out.println(name + "은/는 잔다.");
	}
	void noise() {
		System.out.println(name + "은/는 떠든다.");
	}
	void eat() {
		System.out.println(name + "은/는 먹는다.");
	}
	void hit() {
		System.out.println(name + "은/는 때린다.");
	}
	void study() {
		System.out.println(name + "은/는 공부한다.");
	}
}
