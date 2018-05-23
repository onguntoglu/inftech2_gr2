public class SortierenQuicksort {
	public static int anzahlVertauschungen = 0;
	public static int aufrufeCompare = 0;

	
	private static int partition(Comparable[] f,int start, int end) {
		
		int part = start;
		//int zufallszahl = (int)(Math.random() * (f.length ));

		Comparable pivotelement;
		Comparable temp;

		
		for(int i = start; i<end; i++) {
			aufrufeCompare++;
			if( ((Film)f[i]).compareTo(f[end]) < 0 ) {
				temp = f[i];
				f[i] = f[part];
				f[part] = temp;
				
				anzahlVertauschungen++;
				
				for(int j = 0; j < f.length ; j++ ) { //alle Fime ausgeben nach jedem Tausch
					System.out.println(((Film)f[j]).toString());
				}
				System.out.println("--------------------------------------");
				
				part++;
			}
		}
		return part;
	}
	
	
	public static void quickSort_real(Comparable[] f, int start, int end) {
		int part;
		
		Comparable temp;
		if(start<end) {
			part = partition(f,start,end);
			temp = f[end];
			f[end] = f[part];
			f[part] = temp;
			quickSort_real(f,start,part -1);
			quickSort_real(f,part+1,end);
		}
		
		
	}	
	public static void quickSort(Comparable[] f) {
		int start = 0;
		int end = f.length - 1;
		quickSort_real(f,start,end);
		System.out.println("Anzahl Vertauschungen : ");
		System.out.println(anzahlVertauschungen);
		System.out.println("Anzahl Aufrufe CompareTo : ");
		System.out.println(aufrufeCompare);
	}
}

// Quicksort läuft am schnellsten beim aufsteigend sortierten Array, denn es muss nichts vertauscht werden,
// und läuft am langsamsten beim absteigend sortierten Array