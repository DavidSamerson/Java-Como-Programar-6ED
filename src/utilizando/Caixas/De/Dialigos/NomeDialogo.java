package utilizando.Caixas.De.Dialigos;

import javax.swing.JOptionPane;

public class NomeDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Qual o seu nome e sobrenome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		String message = String.format("Bem vindo , %s , ao programa! você tem %d anos!", name , idade );
		
		
		JOptionPane.showMessageDialog(null, message);
		
	}

}
