package generics;

public class GenericStack<E> {
	
	private E[] list = (E[]) new Object[3];
	private int size=0;
	
	public GenericStack() {
		
	}
	
	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size-1];
	}

	public void push(E o) {
		if(size>=list.length) {
			doubleList();
		}else {
			
			list[size++]= o;
		}
	}

	public E pop() {
		E o = list[size];
		size--;
		return o;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public void doubleList() {
		E[] tempList = (E[])new Object[list.length*2];
		System.arraycopy(list, 0, tempList, 0, list.length);
		list = tempList;
	}
	
	
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
