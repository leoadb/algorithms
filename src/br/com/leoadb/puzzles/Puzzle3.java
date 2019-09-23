package br.com.leoadb.puzzles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Minimum delete operations to make all elements of array same.
 *
 * Given an array of n elements such that elements may repeat.
 * We can delete any number of elements from array.
 * The task is to find minimum number of elements to be deleted from array to make it equal.
 */
public class Puzzle3 {

	public int minimumDeleteOperations(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<>(arr.length);

		for(int i = 0; i < arr.length; i++) {
			int count = countMap.getOrDefault(arr[i], 0);
			countMap.put(arr[i], ++count);
		}

		Collection<Integer> values = countMap.values();

		Iterator<Integer> iterator = values.iterator();

		int maxCount = 0;

		while (iterator.hasNext()) {
			maxCount = Math.max(maxCount, iterator.next());
		}

		return arr.length - maxCount;
	}
}
