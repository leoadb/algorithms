package br.com.leoadb.algorithms;

import br.com.leoadb.data.structure.heap.Heap;
import br.com.leoadb.data.structure.heap.MaxHeap;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**

 A company has 'n' spots for people to park their bicycles.
 You are responsible for locking up the arriving bicycles using padlocks.

 You have, at your disposal, one box full of padlocks and another box full of keys.
 Each padlock has a tag containing its numeric ID and its unique strength.
 Each key has a tag containing the numeric ID of the padlock it opens.
 You want to select the 'n' strongest padlocks for which you also have a key.

 Implement the method findStrongestPadlocks() so that it returns an array of integers with the 'n' strongest padlocks.

 Example:
 --------
 Input:
 padlocks: [[4,11],[2,15],[5,16],[3,40],[1,20],[9,60],[6,22]]
 keys: [2,6,7,3,4]
 n: 3
 Output: [3,6,2]

 */

public class StrongestPadlocks {

	public static int[] findStrongestPadlocks(int n) {
		Heap<Padlock> heap = new MaxHeap<>(new Padlock[]{new Padlock(4, 11), new Padlock(2, 15),
				new Padlock(5, 16), new Padlock(3, 40), new Padlock(1, 20),
				new Padlock(9, 60), new Padlock(6, 22)});

		Set<Integer> keys = new HashSet() {{
			add(2);
			add(6);
			add(7);
			add(3);
			add(4);
		}};

		int i = 0;

		int[] ret = new int[n];

		while(i < n && !heap.isEmpty()) {
			Padlock padlock = heap.extract().get();

			if (keys.contains(padlock.id)) {
				ret[i++] = padlock.id;
			}
		}

		return ret;
	}

	public static void main(String... args) {
		int[] strongestPadlocks = StrongestPadlocks.findStrongestPadlocks(3);

		IntStream.of(strongestPadlocks).forEach(System.out::println);
	}

	static class Padlock implements Comparable<Padlock> {

		Padlock(int id, int strength) {
			this.id = id;
			this.strength = strength;
		}

		private int id;
		private int strength;

		@Override
		public int compareTo(Padlock p) {
			if (this.strength > p.strength) {
				return 1;
			}
			else if(this.strength < p.strength) {
				return -1;
			}
			return 0;
		}
	}
}
