package br.com.leoadb.puzzles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 */
public class Puzzle2 {

	//using sort
	public Pair findSum(int[] arr, int sum) {
		Arrays.sort(arr);

		for(int l = 0, r = arr.length - 1; l < r;) {
			if (arr[l] + arr[r] == sum) {
				return new Pair(arr[l], arr[r]);
			} else if(arr[l] + arr[r] < sum) {
				l++;
			} else {
				r--;
			}
		}

		return null;
	}

	//using HashTable
	public Pair findSum2(int[] arr, int sum) {
		Map<Integer, Boolean> map = new HashMap<>(arr.length);

		for(int i = 0; i < arr.length; i++) {
			int key = sum - arr[i];
			if (map.containsKey(key)) {
				return new Pair(key, arr[i]);
			} else {
				map.put(arr[i], true);
			}
		}

		return null;
	}

	public static class Pair {
		private int x;
		private int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null && !(obj instanceof Pair)) {
				return false;
			}

			Pair pair = (Pair)obj;

			return this.x == pair.x && this.y == pair.y;
		}

		@Override
		public int hashCode() {
			int h = Integer.hashCode(x);

			return h + 31 * Integer.hashCode(y);
		}
	}
}
