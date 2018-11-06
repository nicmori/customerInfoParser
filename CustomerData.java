package customerInfo;

public class CustomerData {
	
	public Res res;
	public Loyalty loyalty;
	public Payment payment;
	
	public CustomerData(Res res, Loyalty loyalty, Payment payment) {
		super();
		this.res = res;
		this.loyalty = loyalty;
		this.payment = payment;
	}
	
	public Res getRes() {
		return res;
	}
	public Loyalty getLoyalty() {
		return loyalty;
	}
	public Payment getPayment() {
		return payment;
	}
	
	public String toString() {
		return "Res: "+res.toString()
			+" Loyalty: "+loyalty.toString()
			+" Payment: "+payment.toString();
	}
}
