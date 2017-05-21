package estudo.GUIs.ImagensGraficas;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{

	private static final long serialVersionUID = 1L;
	private int choice; //opção escolhida
	
	public Shapes (int userChoice){
		choice = userChoice;
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		for ( int i = 0 ; i < 10 ; i++){
			
			switch(choice){
			
			case 1: g.drawRect(30+i*10, 30+i*10, 60+1*10, 60+1*10); break;
			case 2: g.drawOval(30+i*10, 30+i*10, 60+1*10, 60+1*10); break;
			
			//(,,LARGURA DA FIGURA,ALTURA DA FIGURA)
			
			}
			
		}
		
		
	}
	
	
}
