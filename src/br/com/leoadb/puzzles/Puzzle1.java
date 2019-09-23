package br.com.leoadb.puzzles;

import java.util.Arrays;
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

	//does not handle duplicates
	public boolean isSubset(Integer[] arr1, Integer[] arr2) {
		Map<Integer, Boolean> map = new HashMap<>(arr1.length);

		Stream.of(arr1).forEach(n -> map.put(n, true));

		return Stream.of(arr2).allMatch(m -> map.containsKey(m));
	}

	//handle duplicates
	public boolean isSubset2(Integer[] arr1, Integer[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int j = 0;

		for(int i = 0; i < arr1.length && j < arr2.length; i++) {
			if (arr1[i] == arr2[j]) {
				j++;
			}
		}

		return j == arr2.length;
	}

}
