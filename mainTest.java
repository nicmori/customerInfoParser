package customerInfo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
  
public class mainTest {

	public static void main(String[] args) {
		String json = 
                "{"
                    + "\"Res\" : {"
                    	+ "\"ConfirmationNumber\" : \"String\","
                    	+ "\"Guest\" : {"
                    		+"\"Name\" : \"String\","
                    		+"\"Address\" : \"String\""
                    	+"},"
                    	+ "\"Amount\" : {"
                				+"\"Cash\" : 0,"
                				+"\"Points\" : 0"
                		+"}"
                	+ "},"
                	+ "\"Loyalty\" : {"	
                		+"\"AccountNumber\" : \"String\""
                	+ "},"
                	+ "\"Payment\" : {"	
                		+"\"CardNumber\" : 0,"
            			+"\"ExpDate\" : \"String\","
            			+"\"SecCode\" : 0"
            		+ "}"
                + "}";
		System.out.println("Input:");
		System.out.println(json);
		
		CustomerData example = parseJsonToCustomerData(json);
		
		//toString
		System.out.println();
		System.out.println(example.toString());
		//random specific examples
		System.out.println();
		System.out.print("Account Number: ");
		System.out.println(example.getLoyalty().getAccountNumber());
		System.out.print("Reservation Guest Name: ");
		System.out.println(example.getRes().getGuest().getName());
		
	}
	
	public static CustomerData parseJsonToCustomerData(String json) {
		
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(json);
		
		JsonObject res = jsonObject.getAsJsonObject("Res");
		JsonObject loyalty = jsonObject.getAsJsonObject("Loyalty");
		JsonObject payment = jsonObject.getAsJsonObject("Payment");
		
		//Reservation Parse to Object
		String confirmationNumber = res.getAsJsonPrimitive("ConfirmationNumber").getAsString();
		JsonObject guest = res.getAsJsonObject("Guest");
		String Name = guest.getAsJsonPrimitive("Name").getAsString();
		String Address = guest.getAsJsonPrimitive("Address").getAsString();
		ResGuest rg = new ResGuest(Name, Address);
		JsonObject amount = res.getAsJsonObject("Amount");
		String Cash = amount.getAsJsonPrimitive("Cash").getAsString();
		String Points = amount.getAsJsonPrimitive("Points").getAsString();
		ResAmount ra = new ResAmount(Cash, Points);
		Res re = new Res(confirmationNumber, rg, ra);
		
		//Loyalty Parse to Object
		String accountNumber = loyalty.getAsJsonPrimitive("AccountNumber").getAsString();
		Loyalty lo = new Loyalty(accountNumber);
	
		//Payment Parse to Object
		String CardNumber = payment.getAsJsonPrimitive("CardNumber").getAsString();
		String ExpDate = payment.getAsJsonPrimitive("ExpDate").getAsString();
		String SecCode = payment.getAsJsonPrimitive("SecCode").getAsString();
		Payment pa = new Payment(CardNumber, ExpDate, SecCode);
		
		CustomerData customerData = new CustomerData(re, lo, pa);
		return customerData;
	}
}

