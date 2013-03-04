import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test extends JFrame{

	
		public Test()
		{
			this.setLayout(new BorderLayout());	
			this.add(new DrawPolygon());
			this.setSize(350,200);
			this.setVisible(true);
		}

		public static void main(String[] args)
		{
			Test t = new Test();
		}
	
}
class DrawPolygon extends JPanel{
	
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawRect(1, 1, 346, 136);
	}
}
