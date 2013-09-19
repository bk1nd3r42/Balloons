/*
 * @author Ben Kinder
 * @version 1.0
 * Java homework PP2.17 - Displays colored balloons
 */

import javax.swing.JApplet;
import java.awt.*;

public class Balloons extends JApplet {
	private static final long serialVersionUID = 1L;

	public void paint (Graphics page) {
		
		//Draws different colored filled ovals (balloons)
		page.setColor(Color.blue);
		page.fillOval(10, 10, 20, 40);
		page.setColor(Color.red);
		page.fillOval(40, 60, 20, 40);
		page.setColor(Color.magenta);
		page.fillOval(70, 110, 20, 40);
		page.setColor(Color.green);
		page.fillOval(95, 40, 20, 40);
		page.setColor(Color.orange);
		page.fillOval(120, 78, 20, 40);
		
		//Draws strings for balloons
		page.setColor(Color.black);
		page.drawLine(20, 50, 20, 140);
		page.drawLine(50, 100, 50, 170);
		page.drawLine(80, 150, 80, 270);
		page.drawLine(105, 80, 105, 170);
		page.drawLine(130, 118, 130, 208);
	}

}
