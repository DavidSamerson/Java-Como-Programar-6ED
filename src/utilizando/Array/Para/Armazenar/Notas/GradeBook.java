package utilizando.Array.Para.Armazenar.Notas;

public class GradeBook {

	private String courseName;
	private int grades[];

	public GradeBook(String name, int gradesArray[]) 
	{
		courseName = name;
		grades = gradesArray;
	}
	
	public void setCourseName( String name )
	{
		courseName = name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void displayMessage()
	{
		System.out.printf("Seja bem vindo a classe Gradebook \n%s!\n\n", getCourseName());
	}
	
	public void processGrades()
	{
		outputGrades();
		
		System.out.printf("\nClass average is %2.f \n",getAverage());
		
		System.out.printf("\nLowest grade is %d\nHighest grade is %d\n\n",getMinimum(),getMaximum());
		
		outputBarChart();
		
	}

	private void outputBarChart() {
		// TODO Auto-generated method stub
		
	}

	private Object getMinimum() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getMaximum() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getAverage() {
		// TODO Auto-generated method stub
		return null;
	}

	private void outputGrades() {
		// TODO Auto-generated method stub
		
	}
}
