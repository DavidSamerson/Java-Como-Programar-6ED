package estudo.GUI.Utilizando.Objetos.Como.Imagem.Grafica;

import java.awt.Color;
import java.util.Random;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Random randomNumbers = new Random();
	private MyLine lines [];
	
	public DrawPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.WHITE);
		
		lines = new MyLine [5 + randomNumbers.nextInt(5)];
		
	}

}
