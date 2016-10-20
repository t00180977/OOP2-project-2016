//Animal.java

public class Animal{
	//attributes
	
	private String type;
	private String [] continents;
	private double weight;
	private int age;
	

	
    public Animal(String type, String[]continents, double weight, int age){
		setType(type);
		setContinents(continents);
		setWeight(weight);
		setAge(age);
	}
	
	
	public void setType(String type){
		this.type = type;
	}
	
	public String []setContinents(){
		continents = new continents[5];
		for(int i=0;i<continents.lemgth(); i++){
			continents[i] = JOptionPane.showInputDialog("Enter the continent: ");
		}
		this.continents = continents;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	//accessor methods
	public String getType(){
		return this.type;
	}
	
	public String getContinents(){
		return this.continents[];
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public int getAge(){
		return this.age;
	}
	
	//to string method
		public String toString()
	{
		return "Type: " + getType() + "\nContinent: " + getContinents() + "\nWeight: " + 
			getWeight() + "\nAge: " + getAge();
	}
}