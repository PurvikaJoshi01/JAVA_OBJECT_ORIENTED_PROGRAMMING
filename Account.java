package balance;
public class Account {
	public void Account_display(int p) {
		System.out.println("YOUR ACCOUNT BALANCE IS: "+p);
	}
	public static void main(String[]args) {
		int a=10000;
		int b=20000;
		Account x=new Account();
		x.Account_display(a+b);
	}
}
