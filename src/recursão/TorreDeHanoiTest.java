package recursão;

public class TorreDeHanoiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int startPag = 1;
		int endPeg = 3;
		int tempPeg = 2;
		int totalDisk = 3;

		TorreDeHanoi th = new TorreDeHanoi(totalDisk);
		th.solveTowers(totalDisk, startPag, endPeg, tempPeg);
	}

}
