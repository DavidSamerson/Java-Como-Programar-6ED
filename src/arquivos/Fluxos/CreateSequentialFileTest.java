package arquivos.Fluxos;

public class CreateSequentialFileTest {

	public static void main(String[] args) {
		
		CreatSequentialFile app = new CreatSequentialFile();
		
		app.openFile();
		app.addRecords();
		app.closeFile();

	}

}
