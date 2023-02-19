package objectReturn;

class Account{
	static int random = 2001100101;
	int accno;
	double accbal;
	String custname;
	
	public Account(double accbal, String custname) {
		super();
		this.accno = random++;
		this.accbal = accbal;
		this.custname = custname;
	}
	void details(){
		System.out.println("Acc balance: "+accbal+" ,Customer name: "+
				custname+" ,Acc Number: "+accno);
	}
}

class Bank{
	/*Create object of Account- need Customer name and acc balance 
	Return object*/
	Account createaccount(String custname,double accbal){
		Account a = new Account(accbal, custname);
		return a;
	}
}

public class BankAccountMain {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		Bank sbi = new Bank();
		Account acc1 = sbi.createaccount("Sneha", 39234.94);
		acc1.details();
		Account acc2 = sbi.createaccount("Suresh", 27845.3);
		acc2.details();
		Account acc3 = sbi.createaccount("Suresh", 27845.3);
		acc3.details();
		System.out.println("-----------------------------");
	}
}
