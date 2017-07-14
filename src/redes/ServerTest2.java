package redes;

import javax.swing.JFrame;

public class ServerTest2 {

	public static void main(String[] args) {
		
		Server2 app = new Server2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.waitForPackets();

	}

}
