//MyBike.java

import javax.swing.*;

public class MyBike{
	public static void main(String args[])
	{
		String name,make, name2, make2;
		double value, value2, total;
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		name = JOptionPane.showInputDialog("Please enter the name of the owner of the bike: ");
		value = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike: "));
		make = JOptionPane.showInputDialog("Please enter the make of the bike: ");
		
		name2 = JOptionPane.showInputDialog("Please enter the name of the owner of the second bike: ");
		value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the second bike: "));
		make2 = JOptionPane.showInputDialog("Please enter the make of the second bike: ");
		
		total = value + 10 + value2;
		
		b1.setName(name);
		b1.setValue(value + 10);
		b1.setMake(make);
		
		b2.setName(name2);
		b2.setValue(value2);
		b2.setMake(make2); 
		
		JOptionPane.showMessageDialog(null,b1.toString() + "\n\n" + b2.toString() + "\n\nTotal value of the two bikes: " + total);
	}
}