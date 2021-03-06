package redes;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

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
	
	public void waitForPackets(){
		
		while (true) {
			try {
				
				byte data[] = new byte[100];
				DatagramPacket receivePacket = new DatagramPacket(data, data.length);
				socket.receive(receivePacket);
				
				displayMessage("\nPacket Received ...");
				
				sendPacketToClient(receivePacket);
				
			} catch (IOException e) {
				displayMessage(e.toString() + "\n");
				e.printStackTrace();
			}
		}
		
	}
	
	private void sendPacketToClient(DatagramPacket receivePacket) throws IOException {
		
		displayMessage("\n\nEcho data to client");
		
		DatagramPacket sendPacket = new DatagramPacket(receivePacket.getData(), receivePacket.getLength(),
											receivePacket.getAddress(), receivePacket.getPort());
		
		socket.send(sendPacket);
		displayMessage("PacketSend\n");
		
	}
	
	private void displayMessage(final String messageToDisplay){
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				displayArea.append(messageToDisplay);
				
			}
		});
		
	}

}
