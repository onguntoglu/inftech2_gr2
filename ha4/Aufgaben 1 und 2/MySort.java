public class MySort{

    public static void mySort(Comparable[] f){

        Comparable temp;
		int anzahlVertauschungen = 0;
		int aufrufeCompare = 0;

        int min;    // Position for Minimum
        int select; 
        int end = f.length - 1; // End of array
        for(int i = 0; i < end; i++){ // Traverse the array
            min = i;
            for(select = i; select <= end; select++){
                aufrufeCompare++;
                if(((Film)f[select]).compareTo(((Film)f[min]))<0) {
                    min = select;
                }
            }

            temp = f[i];
			f[i] = f[min];
			f[min] = temp;
			
            anzahlVertauschungen++;
            
            for(int j = 0; j < f.length ; j++ ) { //alle Fime ausgeben nach jedem Tausch
				System.out.println(((Film)f[j]).toString());
			}
			System.out.println("--------------------------------------");

		}
		
		System.out.println("Anzahl Vertauschungen : ");
		System.out.println(anzahlVertauschungen);
		System.out.println("Anzahl Aufrufe CompareTo : ");
		System.out.println(aufrufeCompare);

    }
}