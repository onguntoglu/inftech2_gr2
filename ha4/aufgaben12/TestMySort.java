public class TestMySort {

    public static void main(String[] args) {

		// Einlesen der Filme
		String file1 = "filme1.dat";
		String file2 = "filme2.dat";
		String file3 = "filme3.dat";
		Film[] f1 = Parser.readFilme(file1);
		Film[] f2 = Parser.readFilme(file2);
		Film[] f3 = Parser.readFilme(file3);

		// MySort
		System.out.println("MySort, filme1.dat");
		System.out.println("--------------");
		MySort.mySort(f1);
		for (int i=0; i<f1.length;i++){
			System.out.println(f1[i].toString());
		}
		System.out.println();
		
		System.out.println("MySort, filme2.dat");
		System.out.println("--------------");
		MySort.mySort(f2);
		for (int i=0; i<f2.length;i++){
			System.out.println(f2[i].toString());
		}
		System.out.println();
		
		System.out.println("MySort, filme3.dat");
		System.out.println("--------------");
		MySort.mySort(f3);
		for (int i=0; i<f3.length;i++){
			System.out.println(f3[i].toString());
		}
		System.out.println();
		
	}
}
