//email.java
/**/

public class email{
	//attributes
	
	private String recipient;
	private String sender;
	private String message;
	
	
	public email() {
		setRecipient("unknown");
		setSender("unknown");
		setMessage("unknown");
		
}
   //mutator methods
   public void setRecipient(String recipient){
   	this.recipient = recipient;
   }
   
    public void setSender(String sender){
   	this.sender = sender;
   }
   
    public void setMessage(String message){
   	this.message = message;
   }
   
   //accesssor methods
   
   	public String getRecipient(){
		return this.recipient;
	}
	
	public String getSender(){
		return this.sender;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public String append(String x){
		return message+=x;
	}
	
	public String toString()
	{
		return "Recipient: " + getRecipient() + "\nSender: " + getSender() + "\nMessage: " + 
			getMessage();
	}


}