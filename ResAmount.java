package customerInfo;

public class ResAmount {
	public String Cash;
	public String Points;
	
	public ResAmount (String cash, String points) {
		super();
		this.Cash = cash;
		this.Points = points;
	}
	
	public String getCash() {
		return Cash;
	}
	public String getPoints() {
		return Points;
	}
	
	public String toString() {
		return Cash+" "+Points;
	}
}
