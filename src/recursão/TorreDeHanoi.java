package recursão;

public class TorreDeHanoi {

	int numDisk;

	public TorreDeHanoi(int disk) {
		numDisk = disk;
	}

	public void solveTowers(int disk, int sourcePag, int destinationPeg, int tempPeg) {

		if (disk == 1) {
			System.out.printf("\n%d ---> %d", sourcePag, destinationPeg);
			return;
		}

		solveTowers(disk - 1, sourcePag, tempPeg, destinationPeg);
		System.out.printf("\n%d ---> %d", sourcePag, destinationPeg);
		solveTowers(disk - 1, tempPeg, destinationPeg,sourcePag);
	}

}
