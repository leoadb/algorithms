package br.com.leoadb.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Find whether an array is subset of another array.
 *
 * Given two arrays: arr1[0..m-1] and arr2[0..n-1].
 * Find whether arr2[] is a subset of arr1[] or not.
 * Both the arrays are not in sorted order.
 * It may be assumed that elements in both array are distinct.
 */

public class Puzzle1 {

	public static boolean isSubset(Integer[] arr1, Integer[] arr2) {
		Map<Integer, Boolean> map = new HashMap<>(arr1.length);

		Stream.of(arr1).forEach(n -> map.put(n, true));

		return Stream.of(arr2).allMatch(m -> map.containsKey(m));
	}

	public static void main(String... args) {
		boolean result = isSubset(new Integer[] {11, 1, 13, 21, 3, 7}, new Integer[] {11, 3, 7, 1});
		assert result;

		result = isSubset(new Integer[] {1, 2, 3, 4, 5, 6}, new Integer[] {1, 2, 4});
		assert result;

		result = isSubset(new Integer[] {10, 5, 2, 23, 19}, new Integer[] {19, 5, 3});
		assert !result;
	}

}
