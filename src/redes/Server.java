package redes;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame {
	
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private int counter = 1;

	public Server() throws HeadlessException {
		
		super("server");
		
		enterField = new JTextField();
		enterField.setEditable(false);
		enterField.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sendData( e.getActionCommand());
				enterField.setText("");
				
			}
		});
		
		add(enterField, BorderLayout.NORTH);
		
		displayArea = new JTextArea();
		add(new JScrollPane(displayArea), BorderLayout.CENTER);
		
		setSize(300, 150);
		setVisible(true);
	}

	public void runServer() {
		
		try {
			
			server = new ServerSocket(12345, 100);
			
			while (true) {
				try {
					
					waitForConnection();
					getStreams();
					processConnection();
					
				} catch (EOFException e) {
					displayMEssage("\nServer Terminated connection");
				} finally{
					closeConnection();
					counter++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
}
