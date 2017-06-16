package arquivos.Fluxos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateRandomFile {
	
	private static final int NUMBER_RECORDS = 100;
	
	public void createFile(){
		
		RandomAccessFile file = null;
		
		try {
			
			file = new RandomAccessFile("clients.bat", "rw");
			RandomAcessAccountRecord record = new RandomAcessAccountRecord();
			
			for (int i = 0; i < NUMBER_RECORDS; i++) {
				
				record.write(file);
				System.out.println("clients.bat criado com sucesso..\n");
				System.exit(0);
				
			}
		} catch (IOException e) {
			
			System.err.println("Erro ao processar o arquivo..\n");
			System.exit(1);
			
		} finally {
			try {
				if (file != null)
					file.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
	

}
