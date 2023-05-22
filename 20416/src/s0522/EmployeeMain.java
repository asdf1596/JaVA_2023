package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setname("지민철");
		e1.setno(100);
		e1.setage(21);
		System.out.println(e1.toString());
		Employee e2 = new Employee("권민철", 45, 78);
		System.out.println(e2.toString());
		

	}

}
