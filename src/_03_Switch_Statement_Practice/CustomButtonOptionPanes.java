package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Sushi Sunday. Eat sushi today!");
			break;
		case "Monday":
			System.out.println("Macaroon Monday. Eat macaroons today!");
			break;
		case "Tuesday":
			System.out.println("Taco Tuesday. Eat tacos today!");
			break;
		case "Wednesday":
		}
	}
}
