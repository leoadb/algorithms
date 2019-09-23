package br.com.leoadb.puzzles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Count maximum points on same line
 *
 * Given N point on a 2D plane as pair of (x, y) co-ordinates,
 * we need to find maximum number of point which lie on the same line.
 */
public class Puzzle5 {

	public int maximumPoints(Pair[] arr) {
		Map<Pair, Integer> pairsMap = new HashMap<>(arr.length);

		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				Pair pair = new Pair(arr[j].getX() - arr[i].getX(), arr[j].getY() - arr[i].getY());
				pairsMap.put(pair, pairsMap.getOrDefault(pair, 1) + 1);
			}
		}

		int max = 0;

		Collection<Integer> values = pairsMap.values();

		Iterator<Integer> iterator = values.iterator();

		while (iterator.hasNext()) {
			max = Math.max(max, iterator.next());
		}

		return max;
	}
}
