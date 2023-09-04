package s0814_t;

public class Shape {
	private String name;
	static double PI = 3.14;
	static int shapeCnt = 0;
	public Shape() {
		shapeCnt++;
	}
	public Shape(String name){
		this.name = name;
	}
	void draw() {
		System.out.println("["+name+"도형 그리기]");
	}
	void calculateArea() {}
	void calculateRound() {}
}