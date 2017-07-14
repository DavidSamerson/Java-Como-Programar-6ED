package redes;

import java.awt.BorderLayout;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Server2 extends JFrame {
	
	private JTextArea displayArea;
	private DatagramSocket socket;

	public Server2() {
		
		super("Server");
		
		displayArea = new JTextArea();
		add(new JScrollPane(displayArea), BorderLayout.CENTER);
		setSize(400,300);
		setVisible(true);
		
		try {
			
			socket = new DatagramSocket(5000);
			
		} catch (SocketException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		
	}

}
