package lab_6;

public class task1_1 {
	public class MyArrayList<E> {
	    public static final int DEFAULT_CAPACITY = 10;
	    private E[] elements;
	    private int size;

	    public MyArrayList() {
	        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	    }

	    public MyArrayList(int capacity) {
	        this.elements = (E[]) new Object[capacity];
	    }

	    public void growSize() {
	        int newCapacity = elements.length * 2;
	        E[] newElements = (E[]) new Object[newCapacity];
	        System.arraycopy(elements, 0, newElements, 0, size);
	        elements = newElements;
	    }

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public E get(int i) throws IndexOutOfBoundsException {
	        if (i < 0 || i >= size) {
	            throw new IndexOutOfBoundsException();
	        }
	        return elements[i];
	    }

	    public E set(int i, E e) throws IndexOutOfBoundsException {
	        if (i < 0 || i >= size) {
	            throw new IndexOutOfBoundsException();
	        }
	        E replacedElement = elements[i];
	        elements[i] = e;
	        return replacedElement;
	    }

	    public boolean add(E e) {
	        if (size == elements.length) {
	            growSize();
	        }
	        elements[size] = e;
	        size++;
	        return true;
	    }

	    public void add(int i, E e) throws IndexOutOfBoundsException {
	        if (i < 0 || i > size) {
	            throw new IndexOutOfBoundsException();
	        }
	        if (size == elements.length) {
	            growSize();
	        }
	        System.arraycopy(elements, i, elements, i + 1, size - i);
	        elements[i] = e;
	        size++;
	    }

	    public E remove(int i) throws IndexOutOfBoundsException {
	        if (i < 0 || i >= size) {
	            throw new IndexOutOfBoundsException();
	        }
	        E removedElement = elements[i];
	        System.arraycopy(elements, i + 1, elements, i, size - i - 1);
	        elements[size - 1] = null;
	        size--;
	        return removedElement;
	    }
	}

}
