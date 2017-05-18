package iniciando.Objetos.Com.Construtores;

public class Gradebook {

	private String courseName;
	
	public Gradebook(String Name)
	{
		// TODO Auto-generated constructor stub
		courseName = Name;
	}
	
	public void setCourseName(String Name)
	{
		
		courseName = Name;
	}
	
	public String getCourseName()
	{
		
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Bem vindo ao meu programa %s!",getCourseName());
		
	}

}
//Criado por David Samerson