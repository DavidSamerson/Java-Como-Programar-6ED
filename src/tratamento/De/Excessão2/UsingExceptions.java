package tratamento.De.Excessão2;

public class UsingExceptions {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {

			System.err.printf("%s \n\n", e.getMessage());

			e.printStackTrace();

			StackTraceElement STE[] = e.getStackTrace();

			System.out.println("Exibindo o nome da \n Classe / File / Line / Method\n\n");

			for (StackTraceElement ste : STE) {

				System.out.printf("%s\n", ste.getClassName());
				System.out.printf("%s\n", ste.getFileName());
				System.out.printf("%s\n", ste.getLineNumber());
				System.out.printf("%s\n", ste.getMethodName());
			}

		}
	}

	private static void method1() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		method3();
	}

	private static void method3() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Excessão no método 3");
	}

}
