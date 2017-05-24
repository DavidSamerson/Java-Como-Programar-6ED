package cores.Formas.Preenchimento;

import javax.swing.JFrame;

public class DrawSmileyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawSmiley panel = new DrawSmiley();
		JFrame aplication = new JFrame();
		
		aplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplication.add(panel);
		aplication.setSize(230,250);
		aplication.setVisible(true);

	}

}
