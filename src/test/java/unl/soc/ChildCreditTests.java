package unl.soc;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

/**
 * JUnit test suite for {@link ChildCredit} methods
 *
 */
public class ChildCreditTests {

	/**
	 * Tests that the {@link ChildCredit#produceReport(List<Child>)} method
	 * correctly computes the total child tax credit.
	 */
	@Test
	public void produceReportFixedTest01() {
		List<Child> kids = new ArrayList<>();
		kids.add(new Child("A", 10));
		kids.add(new Child("B", 12));
		kids.add(new Child("C", 14));
		kids.add(new Child("D", 16));
		kids.add(new Child("E", 18));
		kids.add(new Child("E", 20));
		int expected = 2500;
		int result = ChildCredit.produceReport(kids);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link ChildCredit#produceReport(List<Child>)} method
	 * correctly computes the total child tax credit.
	 */
	@Test
	public void produceReportFixedTest02() {
		List<Child> kids = new ArrayList<>();
		kids.add(new Child("A", 19));
		kids.add(new Child("B", 19));
		kids.add(new Child("C", 21));
		int expected = 0;
		int result = ChildCredit.produceReport(kids);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link ChildCredit#produceReport(List<Child>)} method
	 * correctly computes the total child tax credit.
	 */
	@Test
	public void produceReportFixedTest03() {
		List<Child> kids = new ArrayList<>();
		int expected = 0;
		int result = ChildCredit.produceReport(kids);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link ChildCredit#produceReport(List<Child>)} method
	 * correctly computes the total child tax credit.
	 */
	@Test
	public void produceReportFixedTest04() {
		List<Child> kids = new ArrayList<>();
		kids.add(new Child("A", 5));
		kids.add(new Child("B", 21));
		int expected = 1000;
		int result = ChildCredit.produceReport(kids);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link ChildCredit#produceReport(List<Child>)} method
	 * correctly computes the total child tax credit.
	 */
	@Test
	public void produceReportFixedTest05() {
		List<Child> kids = new ArrayList<>();
		kids.add(new Child("A", 8));
		kids.add(new Child("B", 5));
		kids.add(new Child("C", 3));
		kids.add(new Child("D", 21));
		int expected = 2000;
		int result = ChildCredit.produceReport(kids);
		Assertions.assertEquals(expected, result);
	}

}
