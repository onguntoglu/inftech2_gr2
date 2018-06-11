import java.util.LinkedList;

public class TestQueue {

	public static void main(String[] args) {
		
	LinkedList<String> stringList = new LinkedList<String>();
		
		
		
		
		
		Queue<String> qlist = new Queue<String>(stringList);
		
		qlist.enqueue("AAA enqueue");
		qlist.enqueue("BBB enqueue");
		qlist.enqueue("CCC enqueue");
		qlist.enqueue("DDD enqueue");
		qlist.enqueue("EEE enqueue");
		qlist.enqueue("FFF enqueue");
		//qlist.dequeue();
		
		//Queue deletedString = qlist.dequeue();
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		System.out.println(qlist.dequeue());
		
		//System.out.println(qlist.peek());

	}

}
