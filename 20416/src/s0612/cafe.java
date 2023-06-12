package s0612;

public class cafe {
	private int coffee;
	private int suger;
	private int cream;
	private static int count = 0;
	
	int getcount() {
		return count;
	}
	void setcount(int count) {
		this.count = count;
		
	}
	
	public void maketea(int coffee) {
		count++;
		this.coffee = coffee;
		System.out.println("블랙커피:" + coffee);
	}
	public void maketea(int coffee, int suger) {
		count++;
		this.coffee = coffee;
		this.suger = suger;
		System.out.println("설탕커피:" + (coffee + suger));
	}
	public void maketea(int coffee, int suger, int cream) {
		count++;
		this.coffee = coffee;
		this.suger = suger;
		this.cream = cream;
		System.out.println("크림커피:" + (coffee + suger + cream));
	}
	public void printcount() {
		System.out.println("총 판매 수량:"+count);
	}
}