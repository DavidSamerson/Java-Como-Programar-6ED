package estudo.GUIs.ImagensGraficas;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawnPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public void paintComponents(Graphics g){
		
		super.paintComponents( g );
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0,height,width,0);
	}

}
