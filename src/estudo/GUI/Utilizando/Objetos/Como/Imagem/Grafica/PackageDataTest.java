package estudo.GUI.Utilizando.Objetos.Como.Imagem.Grafica;

public class PackageDataTest {

	public PackageDataTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackageData packagedata = new PackageData();
		
		System.out.println("After Instalation: \n%s\n", packageData);
		
		packageData.number = 77;
		packageData.string = "goodbye";
		
		System.out.println("\n After Carregando Valores: %s \n",packageData);

	}

}
