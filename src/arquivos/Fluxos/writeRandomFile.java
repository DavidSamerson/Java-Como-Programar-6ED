package arquivos.Fluxos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class writeRandomFile {
	
	private RandomAccessFile output;
	private static final int NUMBER_RECORDS = 100;
	
	public void openFile(){
		try {
			output = new RandomAccessFile("clients.bat", "rw");
		} catch (IOException e) {
			System.err.println("Arquivo não encontrado");
		}
	}

}
