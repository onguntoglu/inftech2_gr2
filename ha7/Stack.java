
public class Stack {

	private Film[] arr;
	private int topIndex = -1;
	
	public Stack(Film[] arr) {
		this.arr = arr;
	}
	
	public int getLength() { //Funktion für mich
		return this.arr.length;
	}
	
	public int getTopIndex() { //Funktion für mich
		return topIndex;
	}
	
	public Film getArrayInhalt(int pos) { //Funktion für mich
		return this.arr[pos];
	}
	
	public Stack() { //wenn kein array eingegeben-> erzeugt 4 Filmobjekte
		this.arr = new Film[4];
	}
	
	public Film[] push(Film obj) { 
		if (this.arr.length - 1 == topIndex) { // if array is full
			System.out.println("Array is full. New array with double length is beeing constructed...");
			Film[] arraydouble = new Film[2*this.arr.length];
			for(int i = 0; i < arr.length; i++) {
				//System.out.println(i);
				arraydouble[i] = this.arr[i]; //alle alte Werte reinkopieren
				
				
			}
			arraydouble[this.arr.length] = obj; //new obj hinzufügen
			topIndex += 1;
			this.arr = arraydouble;
			return arraydouble; //Die Aufgabe will vllt, dass ein Film array zurückgegeben wird 
		}else {
			this.arr[topIndex+1] = obj;
			topIndex += 1;
			return this.arr; //macht nichts, aber sonst beschwert der Comppiler
		}
		
		
	}
	
	public Film pop() {
		System.out.println("In pop function.");
		System.out.println("Top Index:  "+topIndex);
		if(topIndex == -1) {
			System.out.println("Nichts mehr zu löschen.");
			return null;
		}
		Film temp = this.arr[topIndex]; //temp = letzes Element
		this.arr[topIndex] = null;
		topIndex -= 1;
		return temp;
	}
	
	public Film top() {
		if (topIndex == -1) {
			System.out.println("Liste leer. Null liefern.");
			return null;
		}else {
			return this.arr[topIndex];
		}
	}
	
	
	

}
