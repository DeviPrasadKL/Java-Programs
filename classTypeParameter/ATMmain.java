package classTypeParameter;

class ATM {
	String bankname;
	String address;
	String atmid;
	
	public ATM(String bankname, String address, String atmid) {
		this.bankname = bankname;
		this.address = address;
		this.atmid = atmid;
	}
	void withdraw(DebitCard dc, int pin, double amount){
		if (pin==dc.pin){
			System.out.println("Valid pin");
			if (amount <= dc.cardbalance){
				dc.cardbalance = dc.cardbalance - amount;
				System.out.println("withdraw of "+amount+" is sucessful");
			}else{
				System.out.println("Insufficient balance");
			}
		}else{
			System.out.println("Invalid pin");
		}
	}
}
class DebitCard{
	long cardnumber;
	int cvv;
	int pin;
	String cardholderName;
	double cardbalance;
	
	public DebitCard(long cardnumber, int cvv, int pin, String cardholderName,
			double cardbalance) {
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.pin = pin;
		this.cardholderName = cardholderName;
		this.cardbalance = cardbalance;
	}
}
public class ATMmain {
	public static void main(String[] args) {
		ATM machine1 = new ATM("SBI", "Basavangudi", "SBI0034cIU");
		DebitCard mycard = new DebitCard(544957968978l, 540, 1235, "Ramesh", 10450.94);
		machine1.withdraw(mycard, 1235, 5000.00);
		System.out.println("Card blanceis-->"+mycard.cardbalance);
	}
}