package unl.soc;

import java.util.ArrayList;
import java.util.List;

/**
 * This program produces a report on how much a a tax payer can expect for their
 * child tax credits.
 * 
 */
public class ChildCredit {

	/**
	 * Produces a report (printed to the standard output) of how much of a credit
	 * each child receives as well as a grand total.
	 * 
	 * Returns the total child tax credit.
	 * 
	 * @param kids
	 * @return
	 */
	public static int produceReport(List<Child> kids) {
		ArrayList<Double> creditValues = new ArrayList<Double>();
		boolean bonusGiven = false;
		
		for(int i = 0; i < kids.size(); i++) {
			if(kids.get(i).getAge() < 18 && !bonusGiven) {
				creditValues.add(1000.00);
				bonusGiven = true;
			} else if(kids.get(i).getAge() < 18) {
				creditValues.add(500.00);
			} else {
				creditValues.add(0.00);
			}
		}
		
		int totalCredit = 0;
		for(int i = 0; i < creditValues.size(); i++) {
			totalCredit += creditValues.get(i);
		}
		
		String report = "Child          Amount   ";
		for(int i = 0; i < kids.size(); i++) {
			report += "\n" + kids.get(i).toString() + "          $ " + creditValues.get(i);
		}
		report += "\nTotal Credit:          $ " + totalCredit;
		System.out.println(report);
		return totalCredit;

	}

	public static void main(String args[]) {

		Child tom = new Child("Tommy", 14);
		Child dick = new Child("Richard", 12);
		Child harry = new Child("Harold", 21);

		// A list of children above:
		List<Child> kids = new ArrayList<>();
		kids.add(tom);
		kids.add(dick);
		kids.add(harry);

		produceReport(kids);

	}
}
