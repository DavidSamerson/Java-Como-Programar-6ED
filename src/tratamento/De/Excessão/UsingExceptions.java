package tratamento.De.Excessão;

public class UsingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throwException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro na classe Main");
		}

	}

	private static void throwException() throws Exception {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Metodo Exception");
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally {
			System.err.println("Erro");
		}
		
		
		
	}

}
