package estudo.GUI.Utilizando.Objetos.Como.Imagem.Grafica;

import javax.swing.JFrame;

public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}