package pesquisa.E.Classificação;

public class ClassificacaoPorSelecaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassificacaoPorSelecao app = new ClassificacaoPorSelecao(10);
		
		System.out.print("Array: \n");
		System.out.print(app);
		
		app.sort();
		
		System.out.print("Array: \n");
		System.out.print(app);

	}

}
