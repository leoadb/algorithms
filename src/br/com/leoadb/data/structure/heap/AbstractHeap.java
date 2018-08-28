package br.com.leoadb.data.structure.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

abstract class AbstractHeap<T extends Comparable<T>> implements Heap<T>, Comparator<Comparable<T>> {

	@Override
	public Optional<T> extract() {
		if (!isEmpty()) {
			T element = data.get(0);

			swap(0, data.size() - 1);

			data.remove(data.size() - 1);

			heapify(0, data.size());

			return Optional.of(element);
		}
		return Optional.empty();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public void insert(T element) {
		data.add(element);

		int index = data.size() - 1;
		int parent = getParent(index);

		while (parent >= 0 && compare(data.get(index), data.get(parent)) == -1) {
			swap(index, parent);
			index = parent;
			parent = getParent(index);
		}
	}

	@Override
	public Optional<T> top() {
		if (!isEmpty()) {
			return Optional.of(data.get(0));
		}
		return Optional.empty();
	}

	@Override
	public T[] sort() {
		int n = data.size() - 1;

		for(int i = n; i > 0; i--) {
			swap(0, i);
			heapify(0, --n);
		}

		return (T[])data.toArray();
	}

	protected AbstractHeap(T[] arr) {
		data = new ArrayList<>(Arrays.asList(arr));
		build();
	}

	/**
	 * Build a heap.
	 *
	 * All nodes with index larger than or equals to n/2 are leaf nodes, so
	 * there is no need to heapify them.
	 *
	 * Let's heapify from bottom to up.
	 */
	private void build() {
		int n = (data.size() / 2) - 1;
		for(int i = n; i >= 0; i--) {
			heapify(i, data.size());
		}
	}

	/**
	 * Make sure that heap properties are still satisfied.
	 */
	private void heapify(int parentIndex, int n) {
		int left = getLeft(parentIndex);
		int right = getRight(parentIndex);

		int index = parentIndex;

		if (left < n && compare(data.get(left), data.get(index)) == -1) {
			index = left;
		}

		if (right < n && compare(data.get(right), data.get(index)) == -1) {
			index = right;
		}

		if (index != parentIndex) {
			swap(index, parentIndex);
			heapify(index, n);
		}
	}

	/**
	 * Swap elements.
	 *
	 * @param i Index of first element.
	 * @param j Index of second element.
	 */
	private void swap(int i, int j) {
		T temp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, temp);
	}

	/**
	 * @param index Element index.
	 * @return Returns the index of left child.
	 */
	private int getLeft(int index) {
		return 2 * index + 1;
	}

	/**
	 * @param index Element index.
	 * @return Returns the index of right child.
	 */
	private int getRight(int index) {
		return 2 * index + 2;
	}

	/**
	 * @param index Element index.
	 * @return Returns the index of parent element.
	 */
	private int getParent(int index) {
		return (index - 1) / 2;
	}

	private List<T> data;
}
