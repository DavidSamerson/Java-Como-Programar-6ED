package array.Bidimencinal.Notas;

public class GradeBook {

	private String courseName;
	private int grades[][];

	public GradeBook(String name, int gradesArray[][]) {
		courseName = name;
		grades = gradesArray;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void displayMessage() {
		System.out.printf("%s Bem vindo ao programa!\n\n", getCourseName());
	}

	public void processGrades() {
		outputGrades();

		System.out.printf("\n%s %d\n%s %d\n\n", "Valor minimo: ", getMinimum(), "Valor Maximo: ", getMaximum());

		outputBarChart();
	}

	public int getMinimum() {
		int lowGrade = grades[0][0];

		for (int studentGrades[] : grades) {
			for (int grade : studentGrades) {
				if (grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}

	public int getMaximum() {
		int highGrade = grades[0][0];

		for (int studentGrades[] : grades) {
			for (int grade : studentGrades) {
				if (grade > highGrade)
					highGrade = grade;
			}
		}

		return highGrade;
	}

	public double getAverage(int setOfGrades[]) {
		int total = 0;

		for (int grade : setOfGrades)
			total += grade;

		return (double) total / setOfGrades.length;
	}

	public void outputBarChart() {
		System.out.printf("Overall grade distribuition: ");
		int frequency[] = new int[11];

		for (int studentGrades[] : grades) {
			for (int grade : studentGrades) {
				++frequency[grade / 10];
				System.out.println("\n  " + grade / 10 + "  \n");
			}
		}

		for (int count = 0; count < frequency.length; count++) {
			if (count == 10)
				System.out.printf("%5d", 100);
			else
				System.out.printf("%02d-%02d",count*10,count*10+9);
			
			for(int stars = 0; stars < frequency[count];stars++)
			{
				System.out.println("*");
			}
		}
	}

	public void outputGrades() {

	}

}
