package estudo.Grafico.Gui.O.Mundo.E.Gay;

import javax.swing.JFrame;

public class DrawRainbomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawRainbom panel = new DrawRainbom();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,250);
		application.setVisible(true);

	}

}
