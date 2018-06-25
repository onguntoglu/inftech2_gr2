import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> list;

	public Stack() {
		list = new LinkedList<T>();
	}

	public void push(T val) {
		list.addFirst(val);
	}

	public T pop() {
		if(list.size()<1) {
			return null;
		}
		return list.removeFirst();
	}

	public T top() {
		if(list.size()<1) {
			return null;
		}
		return list.getFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}