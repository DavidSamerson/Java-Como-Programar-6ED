package redes;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
	private Socket connection;
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

	private void waitForConnection() throws IOException{
		
		displayMessage("Waiting for Connections \n");
		connection = server.accept();
		displayMessage("Connection "+counter+" recevied from: "+ connection.getInetAddress().getHostName());
		
	}
	
	private void getStreams() throws IOException {
		
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		
		input = new ObjectInputStream(connection.getInputStream());
		
		displayMessage("\nGod I/O Strreams");
		
	}
	
	private void processConnection() throws IOException {
		
		String message = "Connection Sucessful";
		sendData(message);
		
		setTextFieldEditable(true);
		
		do {
			try {
				
				message = (String) input.readObject();
				displayMessage("\n" + message);
				
			} catch (ClassNotFoundException e) {
				displayMessage("\nUnknown Object type received");
			}
		} while (!message.equals("CLIENT>>> TERMINATE"));
	}
}
