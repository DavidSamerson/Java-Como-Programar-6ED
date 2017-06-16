package arquivos.Fluxos;

public class ReadRandomFileTest {

	public static void main(String[] args) {
		
		ReadRandomFile app = new ReadRandomFile();
		
		app.openFile();
		app.readRecords();
		app.closeFile();

	}

}
