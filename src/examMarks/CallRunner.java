package examMarks;

public class CallRunner {
	public static void main(String[] args) {

		// input from user/student
		double physicsInput = (95);
		double chemistryInput = (90);
		double biologyInput = (90);

		Results callResults = new Results();
		callResults.printResults(physicsInput, chemistryInput, biologyInput);

		callResults.printMark(physicsInput, chemistryInput, biologyInput);

	}
}
