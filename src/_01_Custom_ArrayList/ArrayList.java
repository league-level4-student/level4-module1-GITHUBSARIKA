package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T[] t;

	public ArrayList() {
		t = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return t[loc];
	}

	public void add(T val) {
		T tt[] = (T[]) new Object[t.length + 1];
		tt[tt.length - 1] = val;
		for (int i = 0; i < t.length; i++) {
			tt[i] = t[i];

		}
		t = tt;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T ttt[] = (T[]) new Object[t.length + 1];
		for (int i = 0; i < ttt.length; i++) {
			if (i < loc) {
				ttt[i] = t[i];
			} else if (i > loc) {
				ttt[i] = t[i - 1];
			} else {
				ttt[i] = val;

			}

		}
		t = ttt;

	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		t[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T shorte[] = (T[]) new Object[t.length - 1];
		for (int i = 0; i < t.length; i++) {
			if (i < loc) {
				shorte[i] = t[i];
			} else if (i > loc) {
				shorte[i - 1] = t[i];
			} else {
				continue;
			}
		}
		t = shorte;
	}

	public boolean contains(T val) {
for (int i = 0; i < t.length; i++) {
	if(t[i]==val) {
		return true;
	}
}
return false;
		
	}
	public int size() {
		return t.length;
		
	}
}