
public class TestStack {

	public static void main(String[] args) {
		
		Stack stackList = new Stack();
		System.out.println("Length of new array:   "+stackList.getLength());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		Film film1 = new Film("First Film First", 10, 60, "ist gut ", "1/1/1997");
    	Film film2 = new Film("Second Film ", 20, 120, "ist gut ist gut", "2/1/1997");
    	Film film3 = new Film("Third Film ", 30, 180, "ist gut ist gut ist gut", "3/1/1997");
    	Film film4 = new Film("Fourth Film", 40, 240, "ist gut ist gut ist gut ist gut", "4/1/1997");
    	Film film5 = new Film("Fifth Film", 50, 300, "ist gut ist......", "5/1/1997");
    	//Film film6 = new Film("Sixth Film", 60, 360, "ist gut ist......", "6/1/1997");

    	
    	System.out.println("--------------------------");
    	
		stackList.push(film1);
		System.out.println("Top Index:  " + stackList.getTopIndex());
		System.out.println(stackList.top().toString());
		
		System.out.println("--------------------------");
		
		stackList.push(film2);
		System.out.println("Top Index:  " + stackList.getTopIndex());
		System.out.println(stackList.top().toString());
		
		System.out.println("--------------------------");
		
		stackList.push(film3);
		System.out.println("Top Index:  " + stackList.getTopIndex());
		System.out.println(stackList.top().toString());
		
		System.out.println("--------------------------");
		
		stackList.push(film4);
		System.out.println("Top Index:  " + stackList.getTopIndex());
		System.out.println(stackList.top().toString());
		
		System.out.println("--------------------------");
		
		stackList.push(film5);
		System.out.println("Top Index:  " + stackList.getTopIndex());
		System.out.println(stackList.top().toString());
		
		
		
		
		System.out.println("--------------------------");
		
		
		
		
		Film filmdeleted = stackList.pop();
		System.out.println("This Film is deleted: ");
		System.out.println(filmdeleted.toString());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		System.out.println("--------------------------");
		
		
		Film filmdeleted2 = stackList.pop();
		System.out.println("This Film is deleted: ");
		System.out.println(filmdeleted2.toString());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		System.out.println("--------------------------");
		
		
		Film filmdeleted3 = stackList.pop();
		System.out.println("This Film is deleted: ");
		System.out.println(filmdeleted3.toString());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		System.out.println("--------------------------");
		
		Film filmdeleted4 = stackList.pop();
		System.out.println("This Film is deleted: ");
		System.out.println(filmdeleted4.toString());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		System.out.println("--------------------------");
		
		Film filmdeleted5 = stackList.pop();
		System.out.println("This Film is deleted: ");
		System.out.println(filmdeleted5.toString());
		System.out.println("Top Index:  " + stackList.getTopIndex());
		
		System.out.println("--------------------------");
		
		Film filmdeleted6 = stackList.pop(); //gibt Null zurück
		
		System.out.println("--------------------------");
		
		System.out.println("Top Methode beim leeren Stack testen: ");
		Film nofilm = stackList.top(); //nofilm == null
		
		
	}

}
