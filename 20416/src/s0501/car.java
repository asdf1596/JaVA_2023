package s0501;

public class car {
	//속성
	String owner;
	String color;
	int speed;
	int km;
	static int count;
	//생성자
	car(){
		count++;
		System.out.println("총 차의 대수:" + count);
	}
	car(String name){
		owner = name;
		count++;
		System.out.println("총 차의 대수:" + count);
	}
	car(String name, String col, int speed){
		owner = name;
		color = col;
		count++;
		this.speed = speed;
		System.out.println("총 차의 대수:" + count);
	}
	//메소드
	//속도 10 늘리기
	void run(){
		km = km+10;
	}
	//주행속도를 0으로 바꾸고 현재까지의 주행거리를 출력한다.
	void stop() {
		speed = 0;
		System.out.println(owner + "의 차는" + km + "를 달렸습니다.");
	}
	//속도르 5씩 올린다
	void speedUp() {
		speed+=5;
		System.out.println(owner + "의 차의 현재속도는 " + speed+ "입니다.");
		km+=2;
		System.out.println(owner + "의 차의 주행거리는" + km + "입니다.");
	}
	void speedDown() {
		speed-=5;
		System.out.println(owner + "의 차의 현재속도는 " + speed+ "입니다.");
	}
	void printCarInfo() {
		System.out.println("소유자:"+owner);
		System.out.println("색상:"+color);
		System.out.println("속도:"+speed);
		System.out.println("주행거리:"+km);
		System.out.println("총 차의 대수:" + count);
	}
}
