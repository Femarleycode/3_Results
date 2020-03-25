package examMarks;

public class Results {
	public void printResults(double physics, double chemistry, double biology) {

		double total = physics + chemistry + biology;

		System.out.println("Your results are: \n Physics: " + physics + "\n Chemistry: " + chemistry + "\n Biology: "
				+ biology + "\nTotal: " + total);
	}

	public void printMark(double physics, double chemistry, double biology) {

		double percent = (physics + chemistry + biology) * 100 / 450;
		System.out.println("Your percentage is: \t" + percent);

	}
}
