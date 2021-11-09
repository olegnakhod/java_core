package academy.lgs.exercice_03;

import java.util.Arrays;

public class MyArrayList<T> {

	private final int DEFAULT_CAPACITY = 10;
	private final int CUT_RATE = 4;
	private Object[] array;
	private int pointer = 0;

	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			this.array = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.array = new Object[DEFAULT_CAPACITY];
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	public MyArrayList() {
		this.array = new Object[DEFAULT_CAPACITY];
	}

	public void add(T item) {
		if (pointer == array.length - 1)
			resize(array.length * 2);
		array[pointer++] = item;
	}

	public void remove(int index) {
		for (int i = index; i < pointer; i++)
			array[i] = array[i + 1];
		array[pointer] = null;
		pointer--;
		if (array.length > DEFAULT_CAPACITY && pointer < array.length / CUT_RATE)
			resize(array.length / 2);
	}

	@Override
	public String toString() {
		return "MyArrayList array=" + Arrays.toString(array);
	}

	private void resize(int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(array, 0, newArray, 0, pointer);
		array = newArray;
	}

}