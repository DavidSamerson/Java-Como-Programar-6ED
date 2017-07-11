package redes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame {

	private JTextField enterField;
	private JEditorPane contentsArea;

	public ReadServerFile() {
		super("Simple WEB Brownser");

		enterField = new JTextField("Enter file url here");
		enterField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getThePage(e.getActionCommand());
			}
		});
		
		add(enterField, BorderLayout.NORTH);
		
		contentsArea = new JEditorPane();
		
		contentsArea.setEditable(false);
		contentsArea.addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
					getThePage (e.getURL().toString());
				}
			}
		});
		
		add( new JScrollPane(contentsArea), BorderLayout.CENTER );
		setSize(400, 300);
		setVisible( true );
	}
	
	private void getThePage (String location){
		
		try {
			
			contentsArea.setPage(location);
			enterField.setText(location);
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "ERRO");
		}
		
	}

}
