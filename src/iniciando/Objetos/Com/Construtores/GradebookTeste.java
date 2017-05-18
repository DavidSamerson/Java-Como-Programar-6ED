package iniciando.Objetos.Com.Construtores;

public class GradebookTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gradebook gradebook1 = new Gradebook("Bem vindo David Samerson");
		Gradebook gradebook2 = new Gradebook("Para contratá-lo");
		
		System.out.printf("Meu nome é: %s \n",gradebook1.getCourseName());
		System.out.printf("Razão da sua visita: %s",gradebook2.getCourseName());
		

	}

}
