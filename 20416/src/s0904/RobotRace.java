package s0904;
class RobotRaceStart extends Thread{
	public RobotRaceStart(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			if(getName().equals("A")==true)
				System.out.println(getName()+":"+i*10+"m");
			else if(getName().equals("B")==true)
				System.out.println("\t"+getName()+":"+i*10+"m");
			else
				System.out.println("\t\t"+getName()+":"+i*10+"m");
		}
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		super.run();
		System.out.println(getName()+"가 결승전에 도착하였습니다.");
	}
}
public class RobotRace {

	public static void main(String[] args) {
		RobotRaceStart a=new RobotRaceStart("A");
		RobotRaceStart b=new RobotRaceStart("B");
		RobotRaceStart c=new RobotRaceStart("C");
		
		a.start();
		b.start();
		c.start();
	}

}
