package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle2Test {

	@Test
	public void testUsingSort() {
		Puzzle2.Pair pair = puzzle2.findSum(new int[]{1, 4, 45, 6, 10, -8}, 16);

		Assert.assertEquals(new Puzzle2.Pair(6, 10), pair);
	}

	@Test
	public void testUsingHashTable() {
		Puzzle2.Pair pair = puzzle2.findSum2(new int[]{1, 4, 45, 6, 10, -8}, 16);

		Assert.assertEquals(new Puzzle2.Pair(6, 10), pair);
	}

	Puzzle2 puzzle2 = new Puzzle2();
}
