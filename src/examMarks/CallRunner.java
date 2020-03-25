package examMarks;

public class CallRunner {
	public static void main(String[] args) {

		// input from user/student
		double physicsInput = (140);
		double chemistryInput = (85);
		double biologyInput = (140);

		Results callResults = new Results();
		callResults.printResults(physicsInput, chemistryInput, biologyInput);

		callResults.printMark(physicsInput, chemistryInput, biologyInput);

	}
}
