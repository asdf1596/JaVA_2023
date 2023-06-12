package s0508;

public class StaticVariExam {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.SchoolName = "서울로봇고";
		System.out.println(kim.SchoolName + "학생 객체 수는 " + Student.getcount() + "입니다.");
		Student jang = new Student();
		System.out.println(jang.SchoolName + "학생 객체 수는 " + Student.count + "입니다.");
		Student bak = new Student();
		System.out.println(bak.SchoolName + "학생 객체 수는 " + Student.count + "입니다.");
	}

}
