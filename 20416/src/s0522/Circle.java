package s0522;

public class Circle {
	private double radius; //반지름
	private final static double PI = 3.14; 
	Circle (){};
	Circle(double radius){
		//?
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius){
		this.radius = radius;
	}
	double computeArea(){
		return radius * radius * PI;
	}
	double conputePerimeter() {
		return 2 * radius * PI;
	}
	void print() {
		System.out.println("원의 반지름:" + radius);
		System.out.println("넓이:"+computeArea());
		System.out.println("둘레:"+conputePerimeter());
		System.out.println("-------------------------");
	}
}
