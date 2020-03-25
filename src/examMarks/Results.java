package examMarks;

public class Results {
	public void printResults(double physics, double chemistry, double biology) {

		double total = physics + chemistry + biology;

		System.out.println("Your results are: \n Physics: " + physics + "\n Chemistry: " + chemistry + "\n Biology: "
				+ biology + "\nTotal: " + total);
	}

	// Percentages
	public void printMark(double physics, double chemistry, double biology) {

		double percent = (physics + chemistry + biology) * 100 / 450;
		double physPercent = (physics * 100) / 150;
		double chemPercent = (chemistry * 100) / 150;
		double biolPercent = (biology * 100) / 150;
		int failCounter = 0;

		// PHYS
		if (physics >= 90) {
			System.out.println(" Physics - Pass \t" + physPercent);
		} else {
			System.out.println(" Physics - Fail \t" + physPercent);
			failCounter++;
		}

		// CHEM
		if (chemistry >= 90) {
			System.out.println(" Chemistry - Pass \t" + chemPercent);
		} else {
			System.out.println(" Chemistry - Fail \t" + chemPercent);
			failCounter++;
		}

		// BIO
		if (biology >= 90) {
			System.out.println(" Biology - Pass \t" + biolPercent);
		} else {
			System.out.println(" Biology - Fail \t" + biolPercent);
			failCounter++;
		}

		// Overall %
		System.out.println("Overall percentage: \t" + percent);
		if (failCounter > 0) {
			System.out.println("You have failed overall due to failing " + failCounter + " exam(s), sorry.");
		}

	}

}
