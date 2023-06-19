package s0619_1;

public class BookMain {

	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		c1.title = "순정만화";
		c1.writer = "강풀";
		c1.webtoon = true;
		c1.printBook();
		Major m1 = new Major();
		m1.title = "자바의정석";
		m1.writer = "남궁성";
		m1.subject = "프로그래밍";
		m1.printBook();
	}

}
