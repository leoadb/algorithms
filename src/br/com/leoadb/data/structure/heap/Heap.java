package br.com.leoadb.data.structure.heap;

import java.util.Optional;

public interface Heap<T extends Comparable<T>> {

	/**
	 * @return Returns the root element.
	 */
	Optional<T> extract();

	/**
	 * @return Returns true if the heap is empty.
	 */
	boolean isEmpty();

	/**
	 * Insert a new element into the heap.
	 *
	 * @param comparable New element.
	 */
	void insert(T comparable);

	/**
	 * @return Returns an array with sorted elements.
	 */
	T[] sort();

	/**
	 * @return Returns the root element.
	 */
	Optional<T> top();
}
