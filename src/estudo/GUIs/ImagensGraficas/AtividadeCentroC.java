package estudo.GUIs.ImagensGraficas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class AtividadeCentroC extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void desenho (Graphics g){
		
		super.paintComponents(g);
		
		for ( int i = 0 ; i < 10 ; i++){
			
			g.drawOval(10-i, 10-i, 5+i*10, 5+i*10);
			
		}
	}

}
