package arquivos.Fluxos;

public class WriteRandomFileText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeRandomFile app = new writeRandomFile();
		
		app.openFile();
		app.addRecords();
		app.closeFile();

	}

}
