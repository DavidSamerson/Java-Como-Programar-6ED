package estudo.GUIs.ImagensGraficas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Entre com 1 para Retangulo \n Entre com 2 para Oval");
		
		int choice = Integer.parseInt(input);
		
		Shapes panel = new  Shapes (choice);
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
