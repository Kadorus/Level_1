import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryOne {
	public static void main(String[] args) {

		Random random = new Random();

		int counter = 0;

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 1 to 9"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Pick a second number between 1 to 9"));
		int number3 = Integer.parseInt(JOptionPane.showInputDialog("Pick a third number between 1 to 9"));
		int number4 = Integer.parseInt(JOptionPane.showInputDialog("Pick a fourth between 1 to 9"));
		int number5 = Integer.parseInt(JOptionPane.showInputDialog("Pick a fifth number between 1 to 9"));
		int number6 = Integer.parseInt(JOptionPane.showInputDialog("Pick a sixth number between 1 to 9"));

		int[] ticket = new int[6];

		ticket[0] = number1;
		ticket[1] = number2;
		ticket[2] = number3;
		ticket[3] = number4;
		ticket[4] = number5;
		ticket[5] = number6;

		int[] lotto = new int[6];

		while (ticket != lotto) {

			for (int i = 0; i < 6; i++) {

				lotto[0] = random.nextInt(9);
				lotto[1] = random.nextInt(9);
				lotto[2] = random.nextInt(9);
				lotto[3] = random.nextInt(9);
				lotto[4] = random.nextInt(9);
				lotto[5] = random.nextInt(9);

			}

			counter++;

		}

		JOptionPane.showMessageDialog(null, "It took " + counter + " tickets for you to win.");

	}
}
