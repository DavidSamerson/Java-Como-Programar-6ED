package redes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
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

	}

}
