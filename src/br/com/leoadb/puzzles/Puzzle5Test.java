package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle5Test {

	@Test
	public void test1() {
		int maximumPoints = puzzle5.maximumPoints(new Pair[]{new Pair(-1, 1), new Pair(0, 0),
				new Pair(1, 1), new Pair(2, 2), new Pair(3, 3), new Pair(3, 4)});

		Assert.assertEquals(4, maximumPoints);
	}

	Puzzle5 puzzle5 = new Puzzle5();
}
