package array.Bidimencinal.Notas;

public class GradeBook {
	
	private String courseName;
	private int grades [][];
	
	
	public GradeBook(String name, int gradesArray[][])
	{
		courseName=name;
		grades=gradesArray;
	}
	
	public void setCourseName(String name)
	{
		courseName = name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("%s Bem vindo ao programa!\n\n",getCourseName());
	}
}
