public class TestLinkedList{

    // Bekommt eine LinkedList uebergeben und printet alle ELemente auf die Konsole
    public static void printList(LinkedList list) {
    	for (int i = 0; i < list.size() ; i++) {
    		System.out.println(list.get(i).toString());
    	}
    }
    

    // Bekommt eine LinkedList und einen Index uebergeben und entfernt (und printet)
    // aus der LinkedList das Element an Index i. Gibt ggf. eine Fehlermeldung aus.
    public static void removeAtIndex(LinkedList list, int index) {
    	if(index == 0) list.removeHead();
    	else if (index == list.size() - 1) list.removeTail();
    	else if (index > list.size() - 1) System.out.println("Index nicht vorhanden");
    	else list.remove(index);   	
    }


    // Testet die statischen Methoden sowie die Listenmethoden direkt
    public static void main(String[] args){
    	LinkedList filme = new LinkedList();
    	
    	Film film1 = new Film("First Film First", 10, 60, "ist gut ", "1/1/1997");
    	Film film2 = new Film("Second Film ", 20, 120, "ist gut ist gut", "2/1/1997");
    	Film film3 = new Film("Third Film ", 30, 180, "ist gut ist gut ist gut", "3/1/1997");
    	Film film4 = new Film("Fourth Film", 40, 240, "ist gut ist gut ist gut ist gut", "4/1/1997");
    	
    	System.out.println("Adding films to LinkedList filme");
    	
    	filme.addHead(film1);
    	
    	filme.add(film2, 1);
    
    	filme.add(film3, 2);
 
    	filme.add(film4,3);
    	
    	System.out.println("Printing LinkedList filme");
 
    	printList(filme);
    	
    	System.out.println("Removing film at Index 3");
    	
    	removeAtIndex(filme,3);
    	
    	printList(filme);
    	
    }

}
