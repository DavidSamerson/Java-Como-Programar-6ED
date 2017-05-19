package estudo.GUIs.ImagensGraficas;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawnPanel extends JPanel{

	public void paintComponents(Graphics g){
		
		super.paintComponents( g );
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0,height,width,0);
	}

}
