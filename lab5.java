package oopslab;
class Account{
	public String name;
	public long accountNumber;
	public String typeOfAccount;
	
	
}
class CurrentAccount extends Account{
	int balance;
	int min;
	
	public void Accept(int money) {
		if(money>0) {
		balance=balance+money;
		System.out.println(balance);}
		else {
			System.out.println("you can't diposite negetive currency");
		}
	    
	}
	public void Display() {
		System.out.println("balance is "+balance);
	}
	public void Withdrawal(int amount) {
		if(amount<=balance&&amount>0&&balance>0) {
		balance=balance-amount;
		System.out.println(balance);}
		else System.out.println("insufficient balance");
	}
	

CurrentAccount(int min){
	this.min=min;
}
public void minbalance() {
if(balance<min) {
	int servicecharge=499;
	System.out.println("Balance is less than minimum balance");
	balance=balance-servicecharge;
	
	System.out.println("After applying service charge the balance is now "+balance);
}
}
}
class SavingAccount extends Account{
	int balance;
	public void Accept(int money) {
		balance=balance+money;
	    
	}
	public void Display() {
		System.out.println(balance);
	}
	public void Interest(int r,int n,int t) {
		if(r>0&&n>0&&t>0) {
		double interest;
		interest=balance*Math.pow((double)1+(r/n),(double)n*t);
		balance= balance+(int)interest;
		System.out.println(balance);}
		else System.out.println("invalid input");
		
		
	}
	public void Withdrawal(int amount) {
		if(balance>=amount) {
		balance=balance-amount;
		System.out.println(balance);}
		else System.out.println("insufficiant balance");
	}
}

public class lab5 {

	public static void main(String[] args) {
		CurrentAccount ca=new CurrentAccount(10000);
		ca.name="Anika";
		ca.accountNumber=499444995;
		ca.balance=50;
		ca.minbalance();
		ca.Accept(50);
		ca.Display();
		ca.Withdrawal(450);
		SavingAccount sa=new SavingAccount();
		sa.name="Rina";
		sa.accountNumber=56900039;
		sa.balance=48;
		sa.Interest(5,10,5);

	}

}
