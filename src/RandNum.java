import java.util.Random;

import javax.swing.JOptionPane;

public class RandNum {
	public static void main(String[] args) {
		Random rand = new Random();
		int num=rand.nextInt(4);
		switch (num) {
		case 0:
			JOptionPane.showMessageDialog(null, "You will get a new pair of jeans!");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "You will eat tacos tonight!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You will have an amazing life!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "You will never be able to eat candy!");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "You will win the lottery!");
			break;
			
		}
	}
}
