import java.util.LinkedList;

public class Queue<T> {
	
	private LinkedList<T> list ;
	
	public Queue(LinkedList<T> list) {
		this.list = list;
	}
	
	public void enqueue(T val) {
		list.addLast(val);
		//System.out.println(list.getLast());
	}
	
	public T dequeue() {
		 return list.pollFirst();
	}
	
	public T peek() {
		 return list.getFirst();
	}

}
