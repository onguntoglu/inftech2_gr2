public class AVLTree<T> {
    private Node root ;

    // innere abstrakte Klasse Node
    private abstract class Node {

        public int key;
        public int height;

        public Node(int key) {
            this.key = key;
            this.height = 0;
        }

        public abstract Node insert(int key, T element);

        public abstract Node delete(int key);

        public abstract String toString(String tree, String ast);

        public abstract int getBalanceNumber();

    }

    // innere Klasse Fork
    private class Fork extends Node {

        private Node left;
        private Node right;

        // Konstruktor
        public Fork(int key) {
            super(key);
        }

        // erweiterter Konstruktor
        public Fork(int key, Node left, Node right) {
            super(key);
            this.left = left;
            this.right = right;
            updateHeight();
        }

        public void setLeft(Node left){
            this.left=left;
            updateHeight();
        }

        public void setRight(Node right){
            this.right=right;
            updateHeight();
        }

        private void updateHeight(){
            if (left==null)         { this.height = right.height; }
            else if (right == null) { this.height = left.height; }
            else this.height = Math.max(this.left.height, this.right.height)+1;
        }

        public int getBalanceNumber(){
            return right.height-left.height;
        }
		
        public String toString(String tree, String ast) {
            if (right != null)
                tree = right.toString(tree, ast + "| ");
            tree += ast + "|-" + key + "\n";
            if (left != null)
                tree = left.toString(tree, ast + "| ");
            return tree;
        }
		
        public Node insert(int key, T element) {
            if (key <= this.key) {
                setLeft(this.left.insert(key, element));
            } else {
                setRight(this.right.insert(key, element));
            }
            return repairAVL();
        }

        private Fork doubleRotateLeftRight() {
            // Voraussetzung: a, a.left, a.left.right sind
            this.setLeft ( ((Fork) this.left).singleRotateLeft());
            // Verzweigungen
            return this.singleRotateRight();
        }
        private Fork singleRotateRight() {
        	Node x = this.left;
            Node T2 = ((Fork) x).right;
     
            // Perform rotation
            ((Fork)x).right = this;
            this.left = T2;
            
            return (Fork)x;
        }
        
        private Fork singleRotateLeft() {
        	Node y = this.right;
            Node T2 = ((Fork) y).left;
     
            // Perform rotation
            ((Fork)y).left = this;
            this.right = T2;
            
            return (Fork)y;
        }
        
        
        
        public Node delete(int key) {
        	if (key <= getBalanceNumber()){ 
                this.left = this.left.delete(key);            
                if (this.left == null) return right;
            } else {
                this.right = this.right.delete(key);
                if (this.right == null) return left;
            }
            return this;
        }
        
        
        
        private Node repairAVL() {
        	if(getBalanceNumber()>2) {
        		
        		return singleRotateLeft();
        	} else {
        		return singleRotateRight();
        	}
        }
		
       }
		
        

    

    // innere Klasse Leaf
    private class Leaf extends Node {

        private T value;

        public T getVal() {
            return value;
        }

        public Leaf(int key, T value) {
            super(key);
            this.value = value;
        }
        public  int getBalanceNumber(){
            return 0;
        }
		
        public String toString(String tree, String ast) {
            tree += ast + "|-" + key + " " + getVal().toString() + "\n";
            return tree;
        }

        public Node insert(int key, T element) {
            Node newLeaf = new Leaf(key, element);
            if (key < this.key) {
                return new Fork(key, newLeaf, this);
            } else if (key > this.key) {
                return new Fork(this.key, this, newLeaf);
            }
            return newLeaf;
        }
        
        public Leaf delete(int key) {
        	
            return this;
        }
		
        
		

    }
    
    // Konstruktor
    public AVLTree() {
        this.root = null;
    }

    // parametrisierter Konstruktor
    public AVLTree(int key, T data) {
        this.root = new Leaf(key, data);
    }

    // gibt eine String-Repraesentation des Baumes zurueck
    public String toString() {
        String tree = root.toString("", "");
        return tree;
    }
	
    // gibt die String-Repraesentation des Baumes auf der Konsole aus
    public void print() {
        System.out.println(this.toString());
    }

    // fuegt neues Element mit gegebenem Schluessel in den Baum
    public void insert(int key, T element) {
        if (root == null) {
            root = new Leaf(key, element);
        } else {
            root = root.insert(key, element);
        }
    }

    public void delete(int key) {
        this.delete(key);
    }
	
	
	
}
