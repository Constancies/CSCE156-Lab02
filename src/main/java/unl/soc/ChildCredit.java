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
		// TODO: write a loop to iterate over the elements in the child array
		// and output a table as specified
		return 0;

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
