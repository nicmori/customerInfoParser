package customerInfo;

public class Res {
	public String ConfirmationNumber;
	public ResGuest guest;
	public ResAmount amount;
	
	public Res (String confirmationNumber, ResGuest guest, ResAmount amount) {
		super();
		this.ConfirmationNumber = confirmationNumber;
		this.guest = guest;
		this.amount = amount;
	}
	
	public String getConfirmationNumber() {
		return ConfirmationNumber;
	}
	
	public ResGuest getGuest() {
		return guest;
	}
	
	public ResAmount getAmount() {
		return amount;
	}

	public String toString() {
		return ConfirmationNumber+" ResGuest: "+guest.toString()+" ResAmount: "+amount.toString();
	}
}
