package customerInfo;

public class Payment {
	public String CardNumber;
	public String ExpDate;
	public String SecCode;
	
	public Payment (String cardNumber, String expDate, String secCode) {
		super();
		this.CardNumber = cardNumber;
		this.ExpDate = expDate;
		this.SecCode = secCode;
	}
	
	public String getCardNumber(){
		return CardNumber;
	}
	public String getExpDate(){
		return ExpDate;
	}
	public String getSecCode(){
		return SecCode;
	}
	
	public String toString() {
		return CardNumber+" "+ExpDate+" "+SecCode;
	}
}
