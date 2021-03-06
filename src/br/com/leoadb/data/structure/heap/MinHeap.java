package br.com.leoadb.data.structure.heap;

public class MinHeap<T extends Comparable<T>> extends AbstractHeap<T> {

	public MinHeap(T[] arr) {
		super(arr);
	}

	@Override
	public int compare(Comparable o1, Comparable o2) {
		return o1.compareTo(o2);
	}
}
