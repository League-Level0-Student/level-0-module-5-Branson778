package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		         
		     }
		  void skill1() {
			     String dimes =    	   JOptionPane.showInputDialog("How many dimes do you have?");
			     int dimei = Integer.parseInt(dimes);
			    	 dimei*=10;
			    	 JOptionPane.showMessageDialog(null, "You have "+ dimei +" cents.");     
			String height =    	 JOptionPane.showInputDialog("How tall are you? //Put in number of inchs.");
			    	 int inchs = Integer.parseInt(height);
			    	 if(inchs<36) {
			    		 JOptionPane.showMessageDialog(null, "Eat your wheaties.");
			    	 }
			    	 
		}
		  void skill2() {
			  for (int i = 1; i < 30; i++) {
				if(i%3==0) {
					System.out.println(i);
				}
			}
		  }
		  void skill3() {
			Random random = new Random();
			int number20 = random.nextInt(20);
			System.out.println(number20);
			int number10 = random.nextInt(10);
			System.out.println(number10);
			int number = number20-number10;
			JOptionPane.showMessageDialog(null, "The difference between "+ number20 + " and "+ number10 + " is "+ number+ " ." );
		  }
		  void skill4() {
			String city =  JOptionPane.showInputDialog("What city do you live in.");
			if(city.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's finest city!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Please, move to San Diego.");
			}
			String cars = JOptionPane.showInputDialog("How many cars do you have?");
			int car = Integer.parseInt(cars);
			if(car==0) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
			}
			else if(car==1) {
				JOptionPane.showMessageDialog(null, "The model is AMG GLC43.");
			}
			else if(car<=2) {
				int wheels=car*4;
				JOptionPane.showMessageDialog(null, "There is "+ wheels+ " wheels on the cars.");
			}
		  }
		  void skill5() {
			  String school = JOptionPane.showInputDialog("What school do you go to?");
			  JOptionPane.showMessageDialog(null, "Wow, "+ school+ " is a fantasic school.");
		  }
}
