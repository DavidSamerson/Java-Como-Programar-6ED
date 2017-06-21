package pesquisa.E.Classificação;

public class ClassificacaoPorIntercalacaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassificacaoPorIntercalacao app = new ClassificacaoPorIntercalacao(10);
		
		System.out.println("Unsorted"+app+"\n");
		
		app.sort();
		
		System.out.println("Sorted: "+ app);

	}

}
