import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class FancyWindow implements KeyListener {
	static JFrame dog = new JFrame();
	int a = 50;
	int b = 50;

	public static void main(String args[]) {
		FancyWindow f = new FancyWindow();
		f.setup();

	}

	void setup() {

		dog.addKeyListener(this);
		dog.setVisible(true);
		dog.setSize(a, b);
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			dog.setVisible(false);

		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			for (int i = 0; i < 5; i++) {
				Random random = new Random();
				a += random.nextInt(100);
				b += random.nextInt(100);
				dog.setSize(a, b);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
