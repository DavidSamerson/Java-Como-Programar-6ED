package testando.Composicao;

public class EnpoileeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date birth = new Date(7, 24, 1949);
		Date hide = new Date(3, 12, 1988);

		Enpoylee enpoilee = new Enpoylee("Bob", "Blue", birth, hide);
		
		System.out.println(enpoilee);

	}

}
