package br.com.leoadb.puzzles;

import org.junit.Assert;
import org.junit.Test;

public class Puzzle3Test {

	@Test
	public void test1() {
		int deleteOperations = puzzle3.minimumDeleteOperations(new int[]{4, 3, 4, 4, 2, 4});

		Assert.assertEquals(2, deleteOperations);
	}

	@Test
	public void test2() {
		int deleteOperations = puzzle3.minimumDeleteOperations(new int[]{1, 2, 3, 4, 5});

		Assert.assertEquals(4, deleteOperations);
	}

	Puzzle3 puzzle3 = new Puzzle3();
}
