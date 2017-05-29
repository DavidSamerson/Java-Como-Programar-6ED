package utilizando.Array.Para.Armazenar.Notas;

public class GradeBook {

	private String courseName;
	private int grades[];

	public GradeBook(String name, int gradesArray[]) {
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
		System.out.printf("Seja bem vindo a classe Gradebook \n%s!\n\n", getCourseName());
	}

	public void processGrades() {
		outputGrades();

		System.out.printf("\nClass average is %.2f \n", getAverage());

		System.out.printf("\nLowest grade is %d\nHighest grade is %d\n\n", getMinimum(), getMaximum());

		outputBarChart();

	}

	private void outputBarChart() {
		// TODO Auto-generated method stub

		System.out.println("GradeDistribuition: \n");

		int frequency[] = new int[11];

		for (int grade : grades)
			++frequency[grade / 10];

		for (int count = 0; count < frequency.length; count++) {

			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

			for (int stars = 0; stars < frequency[count]; stars++) {
				
				System.out.println("*");
			}
			System.out.println();
		}
	}

	private int getMinimum() {
		// TODO Auto-generated method stub
		int lowGrade = grades[0];

		for (int grade : grades) {
			if (grade < lowGrade)
				lowGrade = grade;
		}

		return lowGrade;
	}

	private int getMaximum() {
		// TODO Auto-generated method stub
		int rightGrade = grades[0];

		for (int grade : grades) {
			if (grade > rightGrade)
				rightGrade = grade;
		}

		return rightGrade;

	}

	private double getAverage() {
		// TODO Auto-generated method stub

		int total = 0;

		for (int grade : grades) {
			total += grade;

		}
		return total / grades.length;
	}

	private void outputGrades() {
		// TODO Auto-generated method stub

		System.out.printf("the grades are: \n");
		for (int students = 0; students < grades.length; students++) {
			System.out.printf("Students %2d:  %3d\n", students + 1, grades[students]);

		}

	}
}
