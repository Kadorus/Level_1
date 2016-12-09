import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dueling_Buttons implements ActionListener {
	int pressed = 0;
	public static void main(String[] args) {
		new Dueling_Buttons().createUI();
	}


	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JTextField field = new JTextField();
	
	private void createUI() {
		
		rightButton.setOpaque(true);
		leftButton.setOpaque(true);
		
		/* rightButton.setBackground(Color.yellow);
		leftButton.setBackground(Color.PINK); */
		
		
		
		// 1. Add the panel to the frame
		frame.add(panel);

		// 2. Make the frame visible
		frame.setVisible(true);
			
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");

		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");

		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);

		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);

		// 7. Add the leftButton to the panel
		panel.add(leftButton);
		
		panel.add(field);
		
		// 8. Add the rightButton to the panel
		panel.add(rightButton);

		// 9. Pack the frame
		frame.pack();

		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
		
		leftButton.setBorder(BorderFactory.createLineBorder(Color.RED, 42));
		
		rightButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 42));
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		pressed++;
		
		if(leftButton==buttonPressed){
			
			rightButton.setText("No, click Me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click me!");
			leftButton.setPreferredSize(SMALL);
			field.setText("You have pressed these buttons " + pressed + " times.");
		}
		
		if(rightButton==buttonPressed){
			
			leftButton.setText("No, click Me!");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("Click me!");
			rightButton.setPreferredSize(SMALL);
			field.setText("You have pressed these buttons " + pressed + " times.");
		}
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		


		frame.pack();
	}
}


