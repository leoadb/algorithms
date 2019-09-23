package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle4Test {

	@Test
	public void test1() {
		int maximumDistance = puzzle4.maximumDistance(
				new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2});

		Assert.assertEquals(10, maximumDistance);
	}

	Puzzle4 puzzle4 = new Puzzle4();
}
