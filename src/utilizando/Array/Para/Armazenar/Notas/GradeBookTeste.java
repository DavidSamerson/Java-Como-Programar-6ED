package utilizando.Array.Para.Armazenar.Notas;

public class GradeBookTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gradesArray[] = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook gradebook = new GradeBook("David Samerson",gradesArray);
		
		gradebook.displayMessage();
		gradebook.processGrades();

	}

}
