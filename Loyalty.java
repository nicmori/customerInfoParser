package customerInfo;

public class Loyalty {
	public String AccountNumber;
	
	public Loyalty (String accountNumber) {
		super();
		this.AccountNumber = accountNumber;
	}
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	
	public String toString() {
		return AccountNumber;
	}
}
