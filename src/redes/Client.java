package redes;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String chatServer;
	private Socket client;

	// CONFIGURAÇÃO DA INTERFACE GRAFICA
	public Client(String host) throws HeadlessException {

		super("Client");

		chatServer = host;

		enterField = new JTextField();
		enterField.setEditable(false);
		enterField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				sendData(event.getActionCommand());
				enterField.setText("");
			}
		});

		add(enterField, BorderLayout.NORTH);

		displayArea = new JTextArea();
		add(new JScrollPane(displayArea), BorderLayout.CENTER);

		setSize(300, 150);
		setVisible(true);
	}

	private void runClient(){
		
		try {
			
			connectToServer();
			getStreams();
			processConnection();
			
		} catch (EOFException e) {
			displayMessage("\nClient terminated")
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			closeConnection();
		}
	}

	private void connectToServer() throws IOException {

		displayMessage("Attempting Connection");

		client = new Socket( InetAddress.getByName(chatServer), 12345 );
		
		displayMessage("Connected to: "+ client.getInetAddress().getHostName());

	}
	
	private void getStreams() throws IOException{
		
		output = new ObjectOutputStream( client.getOutputStream() );
		output.flush();
		
		input = new ObjectInputStream( client.getInputStream() );
		
		displayMessage("\nGot I/O Streams \n");
		
	}
	
	private void processConnection() throws IOException {
		
		setTextFieldEditable(true);
		
		do {
			try {
				
				message = (String) input .readObject();
				displayMessage("\n" + message);
				
			} catch (ClassNotFoundException e) {
				displayMessage("\nUnknown object type received");
			}
		} while (!message.equals("SERVER>>> TERMINATE"));
		
	}
	
	private void closeConnection(){
		
		displayMessage("\nClosing connection");
		setTextFieldEditable(false);
		
		try {
			
			output.close();
			input.close();
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void displayMessage(String string) {
		
		

	}
}
