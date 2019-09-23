package br.com.leoadb.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * Maximum distance between two occurrences of same element in array.
 *
 * Given an array with repeated elements, the task is to find the maximum
 * distance two occurrences of an element.
 */
public class Puzzle4 {

	public int maximumDistance(int[] arr) {
		Map<Integer, Integer> positionsMap = new HashMap<>(arr.length);

		int maxDistance = 0;

		for(int i = 0; i < arr.length; i++) {
			if (positionsMap.containsKey(arr[i])) {
				maxDistance = Math.max(maxDistance, i - positionsMap.get(arr[i]));
			} else {
				positionsMap.put(arr[i], i);
			}
		}

		return maxDistance;
	}
}
