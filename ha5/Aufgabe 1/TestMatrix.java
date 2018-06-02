
public class TestMatrix {

	public static void main(String[] args) {
		
		String[][] stringMatrix = {{"France", "Cafe", "Lori", "Keks"},
				{"Tolis", "Ongun", "Steve", "Moris"}, 
				{"Aaron", "Piperi", "Blue", "Rot"}};

		Matrix<String> testMat = new Matrix<String>(stringMatrix);

		for (int zeile = 0; zeile < testMat.getNumRows(); zeile++) {
			for (int spalte = 0; spalte < testMat.getNumCols(); spalte++) 
			{ System.out.print("testMat["+zeile+"]["+spalte+"]:" + testMat.get(zeile, spalte) + " ");
			}
			     System.out.println();
			}
			

		System.out.println("");
		System.out.println("Anzahl Zeilen: ");
		System.out.println(testMat.getNumRows());
		System.out.println("Anzahl Spalten: ");
		System.out.println(testMat.getNumCols());
		System.out.println("");
		
		testMat.set("Green", 0, 0);
		System.out.println("Element [0][0] aendern");
		System.out.println("testMat[0][0]:" + testMat.get(0, 0));//Zugriff auf ein einzelnes Element
		System.out.println(" ");
		
		for (int zeile = 0; zeile < testMat.getNumRows(); zeile++) {
			for (int spalte = 0; spalte < testMat.getNumCols(); spalte++) 
			{ System.out.print("testMat["+zeile+"]["+spalte+"]:" + testMat.get(zeile, spalte) + " ");
			}
			     System.out.println();
			}
		
		
	}
}
