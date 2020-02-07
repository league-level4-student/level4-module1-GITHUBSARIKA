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
			System.out.println("Waffle Wednesday. Eat waffles today!");
			break;
		case "Thursday":
			System.out.println("Tiramisu Thursday. Eat tiramisu today!");
			break;
		case "Friday":
			System.out.println("French Fry Friday. Eat french fries today!");
			break;
		case "Saturday":
			System.out.println("Spaghetti Saturday. Eat Spaghetti today! ");
			break;
		}
	}
}
