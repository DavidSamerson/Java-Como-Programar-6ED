package estudo.GUIs.ImagensGraficas;

import javax.swing.JFrame;

public class AtividadeCentroCTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtividadeCentroC desenho = new AtividadeCentroC();
		
		JFrame aplication = new JFrame();
		
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplication.add(desenho);
		aplication.setSize(900, 900);
		aplication.setVisible(true);
			

	}

}
