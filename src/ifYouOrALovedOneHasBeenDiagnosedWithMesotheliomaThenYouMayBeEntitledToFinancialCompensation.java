import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ifYouOrALovedOneHasBeenDiagnosedWithMesotheliomaThenYouMayBeEntitledToFinancialCompensation implements ActionListener{
	
	Random random = new Random();
	
	int fieldNumber;
	
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JTextField field1 = new JTextField();
	JButton doubleButton = new JButton("Double");
	JButton squareButton = new JButton("Square");
	
	
	public static void main(String args[]){
		
		ifYouOrALovedOneHasBeenDiagnosedWithMesotheliomaThenYouMayBeEntitledToFinancialCompensation setup = new ifYouOrALovedOneHasBeenDiagnosedWithMesotheliomaThenYouMayBeEntitledToFinancialCompensation();
		setup.createUI();
	}
	
	public void createUI(){
		
		frame1.setSize(500, 500);
		
		frame1.setVisible(true);
		
		fieldNumber = 7;
		
		field1.setText(fieldNumber + "");
				
		frame1.add(panel1);
		panel1.add(field1);
		panel1.add(doubleButton);
		panel1.add(squareButton);
		
		doubleButton.addActionListener(this);
		squareButton.addActionListener(this);
		
		frame1.pack();
		
	}
	
	public void doubleThing(){
		
		fieldNumber = fieldNumber * 2;
		
		field1.setText(fieldNumber + "");
		
	}
	
	public void squareThing(){
		
		fieldNumber = fieldNumber * fieldNumber;
		
		field1.setText(fieldNumber + "");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == doubleButton){
			doubleThing();
			JOptionPane.showMessageDialog(null, "" + fieldNumber);
		}
		if(buttonPressed == squareButton){
			squareThing();
			JOptionPane.showMessageDialog(null, "" + fieldNumber);
			
		}
	}
	
}
