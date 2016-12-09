import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
public class SimpleCalculator {
	
	public static void main(String[] args){
		
		SimpleCalculator calculator = new SimpleCalculator();
		
	}
	
	public SimpleCalculator(){
		
		JFrame frame = new JFrame();
		
		JPanel panel1 = new JPanel();
		
		JPanel panel2 = new JPanel();
		
		JPanel panel3 = new JPanel();
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		
		JTextField field1 = new JTextField();
		
		JTextField field2 = new JTextField();
		
		panel1.add(field1);
		panel1.add(field2);
		
		JButton addButton = new JButton("Add");
		
		JButton subtractButton = new JButton("Subtract");
		
		JButton multiplyButton = new JButton("Multiply");
		
		JButton divideButton = new JButton("Divide");
		
		panel2.add(addButton);
		panel2.add(subtractButton);
		panel2.add(multiplyButton);
		panel2.add(divideButton);
		
		JLabel label1 = new JLabel();
		
		panel3.add(label1);
		
		frame.setVisible(true);
		frame.pack();
	}
	
}
