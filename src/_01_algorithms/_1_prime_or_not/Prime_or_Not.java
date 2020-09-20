package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_Not {
public static void main(String[] args) {
	String numstring = JOptionPane.showInputDialog("Enter any number.");
	int numint = Integer.parseInt(numstring);
	boolean numboolean = false;
	for (int i = 2; i < numint; i++) {
		if(numint%i==0) {
			numboolean = true;
		}
	}
	if (numboolean==true) {
		JOptionPane.showMessageDialog(null, "This number is not prime.");
	}
		else {
			JOptionPane.showMessageDialog(null, "This is a prime number.");	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
