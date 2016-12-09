import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	int rand;

	public static void main(String[] args) {

		FortuneCookie fortune = new FortuneCookie();

		fortune.showButton();

	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);
		

		button.addActionListener(this);
		button.setText("HUMMUS DOGGO");
	}

	public void actionPerformed(ActionEvent e) {

		rand = new Random().nextInt(5);

		JOptionPane.showMessageDialog(null, "Woohoo");

		switch (rand) {

		case 0:

			System.out.println("You will be incinerated.");
			break;
		case 1:

			System.out.println("You will pet a dog.");
			break;
		case 2:

			System.out.println("You will pet a cat.");
			break;
		case 3:

			System.out.println("You will pet a hamster.");
			break;
		case 4:

			System.out.println("You will pet a parrot");
			break;

		}

	}
}
