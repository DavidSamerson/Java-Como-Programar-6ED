package arquivos.Fluxos;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileDemonstrator extends JFrame {
	
	private JTextArea outputArea;
	private JScrollPane scrollPane;
	
	public FileDemonstrator()
	{
		super("Testando a classe");
		outputArea = new JTextArea();
		scrollPane = new JScrollPane(outputArea);
		add(scrollPane, BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
		analysePath();
	}
	
	private File getFile()
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.CANCEL_OPTION) 
		{
			System.exit(1);
		}
		File fileName = fileChooser.getSelectedFile();
		if ((fileName == null)||(fileName.getName().equals(""))) 
		{
			JOptionPane.showMessageDialog(this, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE);
		}
		return fileName;
	}
	public void analysePath()
	{
		File name = getFile();
		
		if(name.exists())
		{
		outputArea.setText(String.format("%s", "EXISTE"));
			if (name.isDirectory()) {
				String directory[] = name.list();
				outputArea.append("\nDiretório: \n");
				for (String string : directory) {
					outputArea.append(string + "\n");
				}
			}
		}
		
		else {
			JOptionPane.showMessageDialog(this, name + "Não EXISTE", "ERRO", JOptionPane.ERROR_MESSAGE );
		}
		
	}

}
