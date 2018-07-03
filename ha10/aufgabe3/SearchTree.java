public class SearchTree<T> {
    private Node root;

    //================ Innere Klasse Node =========================//
    private abstract class Node {
        private int key;
        
       
        
        public Node(int key) {
            this.key = key;
        }

        public int getKey() {
            return this.key;
        }

        public abstract T find (int key);
        
        public abstract Node add(int key, T value);

        public abstract Node delete(int key);

        public abstract String toString(String tree, String ast);
        
        public abstract int countSmaller(int a);
        
        public abstract Node deleteSmaller(int a);

        
    }
    //---------------- end Node -----------------------------------//

    //================ Innere Klasse Fork =========================//
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
        }

        public T find (int key){
            if (key <= this.getKey()) return left.find(key);
            else return right.find(key);
        }
        
        public Node add(int key, T value) {
            if (key <= getKey()) 
                this.left = this.left.add(key, value);
            else this.right = this.right.add(key, value);
         
            return this;
        }

        public Node delete(int key) {
            if (key <= getKey()){ 
                this.left = this.left.delete(key);            
                if (this.left == null) return right;
            } else {
                this.right = this.right.delete(key);
                if (this.right == null) return left;
            }
            return this;
        }
    
        public String toString(String tree, String ast) {
            // Ein Teilbaum wird als String zurueckgegeben.
            // Die Einrueckungen werden durch immer mehr werdende Leerzeichen erreicht.
            // Je nach dem, ob er ein rechter oder linker Teilbaum ist,
            // wird der kleine Ast "|" angefuegt.
            if (tree == "rechterTeilbaum") {
            
                return (this.right.toString("rechterTeilbaum", ast + "    ")
                        + ast + "/-- " + this.getKey() + "\n"
                        + this.left.toString("linkerTeilbaum", ast + "|   "));
                        
            } else if (tree == "linkerTeilbaum") {
            
                return (this.right.toString("rechterTeilbaum", ast + "|   ")
                        + ast + "\\-- " + this.getKey() + "\n"
                        + this.left.toString("linkerTeilbaum", ast + "    "));
                        
            } else {
            
                return (this.right.toString("rechterTeilbaum", ast + "    ")
                        + ast +"--- " + this.getKey() + "\n"
                        + this.left.toString("linkerTeilbaum", ast + "    "));
            }
        }
    
        public int countSmaller(int a){
        		int sum = 0;
        		for(int i = 0; i < a; i++) {
        			if (find(i) != null) { //searching all the keys smaller than a
        			//if data exists-> sum +=1 (sum is defined and initialised above)
        				sum += 1;
        			}
        	} return sum;
        }
        
        public Node deleteSmaller(int a) {
        	for (int i = 0; i < a; i++) {
        		delete(i);
        	}
        	return null;
        }
        
        
    } 
    //---------------- end Fork -----------------------------------//

    //================ Innere Klasse Leaf =========================//
    private class Leaf extends Node {
        private T value;

        public T getVal() {
            return value;
        }

        public Leaf(int key, T value) {
            super(key);
            this.value = value;
        }

        public Node add(int key, T value) {
            Node newLeaf = new Leaf(key, value);
            if (key < getKey()) {
                Node newFork = new Fork(key, newLeaf, this);
                return newFork;
            } else if (key > getKey()) {
                Node newFork = new Fork(getKey(), this, newLeaf);
                return newFork;
            }
            return newLeaf;
        }

        public Node delete(int key) {
            if (key == getKey()) return null;
            else return this;
        }
    
        public T find(int key) {
            if (key == this.getKey()) return this.value;
            else return null;   // key nicht im baum erhalten
        }

        public String toString(String tree, String ast) {
            // Ein Blatt wird als String zurueckgegeben.
            // Der Knick passt sich je nach dem an, ob das
            // Blatt ein linker oder rechter "Teilbaum" ist.
            // Ist das Blatt eine Wurzel, kommt kein Knick zustande.
            if (tree == "rechterTeilbaum") {
                return (ast + "/-- " + this.getKey() + ": " + value + "\n");
            } else if (tree == "linkerTeilbaum") {
                return (ast + "\\-- " + this.getKey() + ": " + value + "\n");
            } else {
                return (ast + "--- " + this.getKey() + ": " + value + "\n");
            }
        }
    
        public int countSmaller(int a){
        	int sum = 0;
    		for(int i = 0; i < a; i++) {
    			
    			if (find(i) != null) { //searching all the keys smaller than a
    			//if data exists-> sum +=1 (sum is defined and initialised above)
    				sum += 1;
    			}
    	} return sum;
    }
        
        public Node deleteSmaller(int a) {
        	for (int i = 0; i < a; i++) {
        		delete(i);
        	}
        	return null;
        }
        
    }
    //---------------- end Leaf -----------------------------------//

    // Konstruktor der Klasse SearchTree
    public SearchTree() {
        this.root = null;
    }

    // parametrisierter Konstruktor
    public SearchTree(int key, T data) {
        this.root = new Leaf(key, data);
    }

    public T find(int key) {
        if (root == null) return null;
        return root.find(key);
    }
    
    // fuegt ein neues value mit gegebenem key in den Baum ein
    public void add(int key, T value) {
        if (root == null) root = new Leaf(key, value);
         else root = root.add(key, value);
    }

    // loescht value mit gegebenem key aus dem Baum
    public void delete(int key) {
        if (root == null) return;
        root = root.delete(key);
    }

    // gibt eine String-Repraesentation des Baumes zurueck
    public String toString() {
        if(root == null){
            return "leerer Baum\n";
        }
        return this.root.toString("wurzel", "");
        //      /--rechter Teilbaum
        // Wurzel
        //      \--linker Teilbaum
    }
    
    public int countSmaller(int a){
    	int sum = 0;
		for(int i = 0; i < a; i++) {
			
			if (find(i) != null) { //searching all the keys smaller than a
			//if data exists-> sum +=1 (sum is defined and initialised above)
				sum += 1;
			}
	} return sum;
}
    
    public Node deleteSmaller(int a) {
    	for (int i = 0; i < a; i++) {
    		delete(i);
    	}
    	return null;
    }
}
