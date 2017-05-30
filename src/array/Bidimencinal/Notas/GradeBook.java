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
	
	public void processGrades()
	{
		outputGrades();
		
		System.out.printf("\n%s %d\n%s %d\n\n","Valor minimo: ",getMinimum(),"Valor Maximo: ",getMaximum());
		
		outputBarChart();
	}
	
	public int getMinimum()
	{
		int lowGrade = grades[0][0];
		
		for(int studentGrades[] : grades)
		{
			for(int grade:studentGrades)
			{
				if(grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}
	
	public int getMaximum()
	{
		return 0;
	}
	
	public double getAverage()
	{
		return 0.0;
	}
	
	public void outputBarChart()
	{
		
	}
	
	public void outputGrades()
	{
		
	}
	
}
