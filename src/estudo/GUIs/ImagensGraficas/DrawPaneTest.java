package estudo.GUIs.ImagensGraficas;

import javax.swing.JFrame;

public class DrawPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawnPanel panel = new DrawnPanel();
		JFrame application = new JFrame();
		
		//configuração pra desligar tudo quando fechado no X
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//guardo o desenho dentro da caixa (painel ao frame)
		application.add(panel);
		application.setSize(250,250); //tamanho do frame
		application.setVisible(true); //frame visivel
		

	}

}
