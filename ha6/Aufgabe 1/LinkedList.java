public class LinkedList {
    
    //Attribute
    private ListElem head;
    private ListElem tail;

    private class ListElem {
        Film data;
        ListElem next;
        
  
        ListElem(Film data) {
            this.data = data;
            this.next = null;
        }

        ListElem(Film data, ListElem next) {
            this.data = data;
            this.next = next;
        }
    }

    //Konstruktor erzeugt eine leere Liste
    public LinkedList() {  
        this.head = null;
        this.tail = null;
    }

    public Film getHead() {
    	if(head.data == null) return null;
    	 else return head.data;
    }
    
    public Film getTail() {
    	if(tail.data == null) return null;
    	 else return tail.data;
    }
    
    public Film get(int pos) {
    	ListElem laufvariable = head;    //starting from the head
    	while(pos > 0) {
    		if (laufvariable.next == null)  return null; // checking if there is a next element
    		laufvariable = laufvariable.next;      // reaching the element at the place pos
    		pos = pos - 1;
    	}
    	return laufvariable.data;
    }
    
    public void addHead(Film val) {
    	if (head==null) {
    		head = new ListElem(val) ;//if there was not a head
    	}
    	else 							//if there was a head
    		head = new ListElem(val,head); //new head with reference at old head
    }
    
    public void addTail(Film val) {
    	ListElem newobj = new ListElem(val); //new element
    	tail.next = newobj; // old tail has reference to the new element 
    	tail = newobj;    // tail is the new element
    }
    
    public void add(Film val, int pos) {
    	ListElem newobj = new ListElem(val); //new element without reference 
    	ListElem laufvariable = head; // starting from the head
    	if(pos == 1) {
    		head.next = newobj;
    	} else {
    	while(pos > 1) {
    		//if (laufvariable.next == null)  addTail(val) ; // checking if there is a next element, otherwise addTail
    		laufvariable = laufvariable.next; // reaching one place before the place where we want to add the new element
    		pos = pos - 1;
    	}
    	
    		laufvariable.next = newobj;
    	
    	}
    }
    
    public Film removeHead() {
    	if(head == null) return null; //checking if there is a head
    	System.out.println("Removing head of the list");
    	ListElem temp = head;
    	head = head.next; //head is now the next object
    	return temp.data; //returning value of the old, deleted head 
    }
    
    public Film removeTail() {
    	if(head == null) return null; //checking if there is a head
    	System.out.println("Removing tail of the list");
    	ListElem laufvariable = head;
    	while(laufvariable.next.next != null) { //searching two elements after laufvariable
    		laufvariable = laufvariable.next;	// set laufvariable to next element
    	}	
    	laufvariable.next = null; // if two elements after laufvariable point to null, set next element (last element of list) of laufvariable to null
    	return laufvariable.data; // return laufvariable
    }
    
    public Film remove(int pos) {
    	ListElem laufvariable = head; // starting from the head
    	System.out.println("Removing element at Index " + pos);
    	while(pos > 1) {
    		laufvariable = laufvariable.next; //reaching one place before the place where we want to add the new element
    		pos = pos - 1;
    	}
    	ListElem temp = laufvariable.next; // save the object that is about to be deleted 
    	laufvariable.next = laufvariable.next.next; //the object before at "pos - 1" has refence to "pos + 1" 
    	return temp.data;							//and the "pos" element is not anymore reachable
    }
    
    public boolean isEmpty() {
    	return head != null; //if there is a head is not empty, otherwise is empty
    }
    
    public int size() {
    	int count = 0;
    	ListElem laufvariable = head; //starting from the head
    	if(head == null) return 0; //checking if there is a head
    	count = count + 1; //counter plus 1 if head exists
    	while(laufvariable.next != null) { //if there is a next element add 1 to counter
    		count = count + 1;
    		laufvariable = laufvariable.next; // going to next object
    	}
    	return count;
    }
    
    public int find(Film obj) {
    	if (head == null) return -1; //check if there is a head
    	ListElem laufvariable = head; //starting from the head
    	int position = 0;
    	while(laufvariable.next != null) { //check if there is next element
    		if(laufvariable.next.data == obj) return position + 1; // if next film == obj then return the position of next object
    		laufvariable = laufvariable.next; //jump to the next object
    		position = position + 1;
    	}
    	return -1; //after the while loop -> that means obj wasn't found
    	
    }
    
    
    
}
