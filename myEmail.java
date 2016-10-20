//myEmail.java

public class myEmail{
	public static void main(String args[])
	{
		email e1 = new email();
		
		e1.setRecipient("James O'Donoghue");
		e1.setSender("Colm Cooper");
		e1.setMessage("\nFootball Training tomorrow see u there bud!");
		
		System.out.println(e1.toString());
	}
}