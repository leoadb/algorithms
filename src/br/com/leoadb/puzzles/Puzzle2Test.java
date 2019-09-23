package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle2Test {

	@Test
	public void testUsingSort() {
		Pair pair = puzzle2.findSum(new int[]{1, 4, 45, 6, 10, -8}, 16);

		Assert.assertEquals(new Pair(6, 10), pair);
	}

	@Test
	public void testUsingHashTable() {
		Pair pair = puzzle2.findSum2(new int[]{1, 4, 45, 6, 10, -8}, 16);

		Assert.assertEquals(new Pair(6, 10), pair);
	}

	Puzzle2 puzzle2 = new Puzzle2();
}
