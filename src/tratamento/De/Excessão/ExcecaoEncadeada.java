package tratamento.De.Excessão;

public class ExcecaoEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			method1();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void method1()throws Exception {
		
		try {
			method2();
		} catch (Exception e)  {
			throw new Exception("Erro no método 1");
		}
		
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		try {
			method3();
		} catch (Exception e) {
			throw new Exception("Erro no método 2");
		}
	}

	private static void method3() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Erro no método 3");
	}

}
