public class CustomCollection {
	private Object[] objArray = new Object[10];
	private int elementCount = 0;

	public void add(Object obj) {
		if (elementCount == objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	public void increaseCapacity() {
		// TODO Auto-generated method stub
		int newCapacity = objArray.length * 2;
		Object[] nextArray = new Object[newCapacity];
		for (int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];
			objArray = nextArray;
		}
	}

	public int capacity() {
		return objArray.length;
	}

	public int size() {
		return elementCount;
	}

	public Object getElement(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return objArray[index];
	}

	public void replaceElement(int index, Object obj) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		objArray[index] = obj;
	}

	public void removeElement(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		while (index < size() - 1) {
			objArray[index] = objArray[index + 1];
			index++;
		}
		objArray[index] = null;
		elementCount--;
	}

	public void insertElement(int index, Object obj) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (size() == capacity()) {
			increaseCapacity();
		}
		for (int i = size() - 1; i >= index; i--) {
			objArray[i + 1] = objArray[i];
		}
		objArray[index] = obj;
	}

	public boolean search(Object obj)
	// Checks if a certain element is present in the collection
	{
		for (int i = 0; i < size(); i++) {
			if (objArray[i] == obj) {
				return true;
			}

		}
		return false;
	}

	public void showAll() {
		System.out.print("Elements in the array: ");
		for (int i = 0; i < size(); i++) {
			System.out.print(" " + objArray[i]);
		}
		System.out.println();
	}

}
