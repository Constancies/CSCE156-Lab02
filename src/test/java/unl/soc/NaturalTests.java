package unl.soc;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

/**
 * JUnit test suite for {@link Natural} methods
 *
 */
public class NaturalTests {

	/**
	 * Tests that the {@link Natural#sumWithWhile(int)} method correctly computes
	 * the sum of natural numbers.
	 */
	@Test
	public void sumWithWhileFixedTest01() {
		int expected = 0;
		int result = Natural.sumWithWhile(0);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithWhile(int)} method correctly computes
	 * the sum of natural numbers.
	 */
	@Test
	public void sumWithWhileFixedTest02() {
		int expected = 55;
		int result = Natural.sumWithWhile(10);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithWhile(int)} method correctly computes
	 * the sum of natural numbers.
	 */
	@Test
	public void sumWithWhileFixedTest03() {
		int expected = 325;
		int result = Natural.sumWithWhile(25);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithWhile(int)} method correctly computes
	 * the sum of natural numbers.
	 */
	@Test
	public void sumWithWhileFixedTest04() {
		int expected = 4005;
		int result = Natural.sumWithWhile(89);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithWhile(int)} method correctly computes
	 * the sum of natural numbers.
	 */
	@Test
	public void sumWithWhileFixedTest05() {
		int expected = 88410;
		int result = Natural.sumWithWhile(420);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithFor(int)} method correctly computes the
	 * sum of natural numbers.
	 */
	@Test
	public void sumWithForFixedTest01() {
		int expected = 0;
		int result = Natural.sumWithFor(0);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithFor(int)} method correctly computes the
	 * sum of natural numbers.
	 */
	@Test
	public void sumWithForFixedTest02() {
		int expected = 55;
		int result = Natural.sumWithFor(10);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithFor(int)} method correctly computes the
	 * sum of natural numbers.
	 */
	@Test
	public void sumWithForFixedTest03() {
		int expected = 325;
		int result = Natural.sumWithFor(25);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithFor(int)} method correctly computes the
	 * sum of natural numbers.
	 */
	@Test
	public void sumWithForFixedTest04() {
		int expected = 4005;
		int result = Natural.sumWithFor(89);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Tests that the {@link Natural#sumWithFor(int)} method correctly computes the
	 * sum of natural numbers.
	 */
	@Test
	public void sumWithForFixedTest05() {
		int expected = 88410;
		int result = Natural.sumWithFor(420);
		Assertions.assertEquals(expected, result);
	}
}
