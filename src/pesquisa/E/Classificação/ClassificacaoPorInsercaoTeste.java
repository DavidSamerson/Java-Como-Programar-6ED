package pesquisa.E.Classificação;

public class ClassificacaoPorInsercaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassificacaoPorInsercao app = new ClassificacaoPorInsercao(10);
		
		System.out.print("Array: \n");
		System.out.print(app);
		
		app.sort();
		
		System.out.print("Array: \n");
		System.out.print(app);
	}

}
