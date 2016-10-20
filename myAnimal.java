//myAnimal.java

public class myAnimal{
	public static void main(String args[])
	{
		Animal a1 = new Animal();
		
		a1.setType("Tiger");
		a1.setContinents("Europe");
		a1.setWeight(150.1);
		a1.setAge(12);
		System.out.println(a1.toString());
	}
}