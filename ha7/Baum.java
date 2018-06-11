
public class Baum {
	private String[] knoten;
	
	public Baum(String[] knoten) {
		this.knoten = knoten;
	}
	
	private void printInorder(int i) {
		if (i > knoten.length - 1) {
			return;
		}
		printInorder(getLeftChild(i));
		System.out.print(knoten[i] + " ");
		printInorder(getRightChild(i));
	}
	
	private void printPreorder(int i) {
		if (i > knoten.length - 1) {
			return;
		}
		System.out.print(knoten[i] + " ");
		printPreorder(getLeftChild(i));
		printPreorder(getRightChild(i));			
	}
	
	private void printPostorder(int i) {
		if (i > knoten.length - 1) {
			return;
		}
		printPostorder(getLeftChild(i));
		printPostorder(getRightChild(i));
		System.out.print(knoten[i] + " ");
	}
	
	private int getLeftChild(int index) {
		return 2*index + 1;
	}
	
	private int getRightChild(int index) {
		return 2*index + 2;
	}
	
	public void printPreorder() {
		System.out.println("Preorder  :  ");
		printPreorder(0);
	}

	public void printInorder() {
		System.out.println("Inorder  :  "); 
		printInorder(0);


	}
	
	public void printPostorder() {
		System.out.println("Postorder  :  "); 
		printPostorder(0);


	}

}


