package s0508;

public class GetSetExam {

	public static void main(String[] args) {
		//stuedent 클래스의 name, grade 를 수정한다
		Student kim = new Student();
		System.out.println(kim.getName());
		kim.setName("지민철");
		System.out.println(kim.getName());
		kim.setgrade(3);
		System.out.println(kim.getName() +"은/는 " + kim.getgrade()+"학년입니다.");
		Student chee = new Student();
		chee.setName("지민철");
		chee.setgrade(2);
		chee.setscore(100);
		chee.printall();
	}

}
