package s0619_1;

public class Cartoon extends book{
	boolean webtoon;

	@Override
	void printBook() {
		super.printBook();
		System.out.print("이 만화는 ");
		if(webtoon)
			System.out.println("웹툰입니다");
		else
			System.out.println("웹툰이 아닙니다");
	}
}
