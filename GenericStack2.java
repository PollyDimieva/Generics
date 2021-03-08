package generics;

import java.util.ArrayList;


	public class GenericStack2<T> extends ArrayList<T> {

	    public void push(T o) {
	        add(o);
	    }

	    public T pop() {
	        return remove(size() - 1);
	    }

	    public boolean isEmpty() {
	        return size() == 0;
	    }

	    public T peek() {
	        return get(size() - 1);
	    }
	}