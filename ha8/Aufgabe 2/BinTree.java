import java.util.Iterator;

public class BinTree<T> implements Iterable<T> {

	public Node root;

	
	
	
	private class Node {
		T data;
		Node left;
		Node right;

		public Node(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public Node(T data, Node l, Node r) {
			this.data = data;
			this.left = l;
			this.right = r;
		}
	}

	/** Konstruktor */
	public BinTree(T data) {
		this.root = new Node(data, null, null);
	}

	/** Konstruktor */
	public BinTree(Node n) {
		this.root = n;
	}

	/** Konstruktor */
	public BinTree(T data, BinTree<T> left, BinTree<T> right) {
		Node a = null;
		Node b = null;
		if (left != null) a = left.root;
		if (right != null) b = right.root;
		this.root = new Node(data, a, b);
	}

	/** Erstellt ein Duplikat eines kompletten Teilbaums
	  * ausgehend von einem uebergebenem Elternknoten.
	  * Arbeitet rekursiv.
	  * Gibt den Wurzelknoten des Teilbaumduplikats zurueck.
	  */
	public Node duplicate(Node parent) {
		if (parent == null) {
			return null;
		} else {
			Node neu = new Node(parent.data);
			neu.left = duplicate(parent.left);
			neu.right = duplicate(parent.right);
			return neu;
		}
	}
	
	
	public Iterator<T> iterator(){
	return new TreeIterator();
		
	}
	
	// -----------------------------------------------------
	private class TreeIterator implements Iterator<T> {

		private Stack<Node> stack; 
		
		public TreeIterator() {
			stack = new Stack<Node>();
			if (root != null)
				stack.push(root);
		}
		
		public boolean hasNext() {
			return !stack.isEmpty();
		}
		
		public T next() {
			Node current = stack.pop();
			if (current.left != null) {
				stack.push(current.left);
			}
			if (current.right != null) {
				stack.push(current.right);
			}
			return current.data;
		}
		
		public void remove() {
			
		}
		
	}

}
