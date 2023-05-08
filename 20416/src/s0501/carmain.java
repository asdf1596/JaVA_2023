package s0501;

import s0417.Student;

public class carmain {

	public static void main(String[] args) {
		car myCar = new car();
		car yourCar = new car("진수", "파랑", 100);
		car yourCar2 = new car("현강", "하양", 200);
		myCar.owner = "예섭";
		myCar.km = 0;
		myCar.speed = 0;
		myCar.color = "핑크";
		myCar.printCarInfo();
		myCar.run();
		myCar.run();
		myCar.run();
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp();
		myCar.stop();
		
		yourCar.color = "블랙";
		yourCar.printCarInfo();
		yourCar.speedUp();
		
		Student s = new Student(); 
	}

}
