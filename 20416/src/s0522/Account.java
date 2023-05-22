package s0522;

public class Account {
	private String name;
	private int no = 0;
	private int balance = 0;
	public Account(){};
	public Account(String name, int no){
		this.name = name;
		this.no=no;
	};
	public Account(String name, int no, int balance){
		this.name = name;
		this.no=no;
		this.balance=balance;
	};
	public String getname(){
		return name;
	}
	public int getno(){
		return no;
	}
	public int getbalance(){
		return balance;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setno(int no) {
		this.no=no;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	public void printinfo() {
		System.out.println("[계좌정보] "+"예금주:"+name+" 계좌번호:"+no+" 현재잔고:"+balance);
	}
	public void deposit(int balance) {
		System.out.println(name+"님 "+balance+"원 입금");
		this.balance+=balance;
	}
	public void withdraw(int balance) {
		if(balance>this.balance) {
			System.out.println(name+"님 "+balance+"원 출금 실패-현재잔액 "+this.balance+"원");
		}
		else{
			System.out.println(name+"님 "+balance+"원 출금");
		}
		this.balance-=balance;
	}

}
