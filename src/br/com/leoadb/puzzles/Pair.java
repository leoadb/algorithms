package br.com.leoadb.puzzles;

public class Pair {
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
