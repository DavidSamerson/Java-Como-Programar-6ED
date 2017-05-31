package estudo.Grafico.Gui.O.Mundo.E.Gay;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawRainbom extends JPanel{

	final Color VIOLET = new Color (128,0,128);
	final Color INDIGO = new Color (75, 0, 130);
	
	private Color colors[] = {Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
								Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	
	public DrawRainbom()
	{
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int radius = 20;
		
		int centerX = getWidth()/2;
		int centerY = getHeight()-10;
		
		for(int count = colors.length;count > 0; count--)
		{
			
		}
		
		
	}
}
