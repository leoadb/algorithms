package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle1Test {

	@Test
	public void test1() {
		boolean result = puzzle1.isSubset(
			new Integer[] {11, 1, 13, 21, 3, 7}, new Integer[] {11, 3, 7, 1});

		Assert.assertTrue(result);
	}

	@Test
	public void test2() {
		boolean result = puzzle1.isSubset(
			new Integer[] {1, 2, 3, 4, 5, 6}, new Integer[] {1, 2, 4});

		Assert.assertTrue(result);
	}

	@Test
	public void test3() {
		boolean result = puzzle1.isSubset(
			new Integer[] {10, 5, 2, 23, 19}, new Integer[] {19, 5, 3});

		Assert.assertFalse(result);
	}

	@Test
	public void testDuplicates() {
		boolean result = puzzle1.isSubset2(
			new Integer[] {1, 4, 2}, new Integer[] {1, 4, 4, 2});

		Assert.assertFalse(result);
	}

	Puzzle1 puzzle1 = new Puzzle1();
}
