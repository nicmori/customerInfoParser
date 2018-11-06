package customerInfo;

public class ResGuest {
	public String Name;
	public String Address;
	
	public ResGuest (String name, String address) {
		super();
		this.Name = name;
		this.Address = address;
	}
	
	public String getName() {
		return Name;
	}
	public String getAddress() {
		return Address;
	}
	
	public String toString() {
		return Name+" "+Address;
	}
}
