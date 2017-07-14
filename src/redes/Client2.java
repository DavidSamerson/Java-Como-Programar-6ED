package redes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client2 extends JFrame {

	private JTextField enterField;
	private JTextArea displayArea;
	private DatagramSocket socket;

	public Client2() {

		super("Client");

		enterField = new JTextField("Type Message Here");
		enterField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					String message = e.getActionCommand();
					displayArea.append("\nSending Packet " + message + "\n");
					
					byte data[] = message.getBytes();
					
					DatagramPacket sendPacket = new DatagramPacket (data, data.length, InetAddress.getLocalHost(), 5000);
					
					socket.send(sendPacket);
					displayArea.append("Packet Send\n");
					displayArea.setCaretPosition(displayArea.getText().length());

				} catch (IOException er) {
					displayMessage(er.toString() + "\n");
					er.printStackTrace();
				}

			}
		});
		
		add(enterField, BorderLayout.NORTH);
		displayArea = new JTextArea();
		add(new JScrollPane(displayArea), BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
		
		try {
			socket = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
			System.exit(1);
		}

	}
	
	

	protected void displayMessage(String string) {
		// TODO Auto-generated method stub
		
	}

}
