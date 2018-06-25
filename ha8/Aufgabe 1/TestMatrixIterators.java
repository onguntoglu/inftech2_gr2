import java.util.Iterator;

public class TestMatrixIterators {

	public static void main(String[] args) {
		
		Integer[][] intarr =  {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		
		System.out.println("For-Each Loop :  ");
		for(Integer u[] : intarr ) {
			for(Integer elem: u) {
				System.out.print(elem + "   ");
			}
			
		}
		System.out.println("");
		System.out.println("Iterator :  ");
		
		Matrix<Integer> matrx = new Matrix<Integer>(intarr);
		//matrx.setIteratorMode('b'); //Backward Iterator activate
		//matrx.setIteratorMode('f'); //Forward Iterator activate
		Iterator<Integer> matrxIt = matrx.iterator();
		while(matrxIt.hasNext()) {
			System.out.print(matrxIt.next() + "   ");
		}
		
		
		Character[][] chararr =  {
				{'a','b'},
				{'c','d'},
				{'e','f'},
				{'g','h'},
		};
		
		System.out.println("");
		System.out.println("For-Each Loop :  ");
		
		for(Character u[] : chararr ) {
			for(Character elem: u) {
				System.out.print(elem + "   ");
			}
			
		}
		
		System.out.println("");
		System.out.println("Iterator :  ");
		
		Matrix<Character> matrxChar = new Matrix<Character>(chararr);
		//matrxChar.setIteratorMode('b'); //Backward Iterator activate
		//matrxChar.setIteratorMode('f'); //Forward Iterator activate
		Iterator<Character> matrxCharIt = matrxChar.iterator();
		while(matrxCharIt.hasNext()) {
			System.out.print(matrxCharIt.next() + "   ");
		}
		System.out.println("");
		System.out.println("If you want to use the backward Iterator then uncomment the set-Methode ");

	}
	
	
}
