
public class MySort {
	
	public static void mySort(Comparable[] f) {	// Implementierung Selection Sort

		Comparable temp;
		int anzahlVertauschungen = 0;
		int aufrufeCompare = 0;
		
		int min;
		int select;
		int end = f.length - 1;
		for(int i = 0; i <= end; i++ )
		{
			min = i;	
			for(select = i; select <= end; select++) {
				aufrufeCompare++;							// compareTo wird immer aufgerufen
				if(((Film)f[select]).compareTo(f[min])<0) {	// Falls der Film lexikographisch vorne steht
					min = select;							
					}
			}
			temp = f[i];
			f[i] = f[min];
			f[min] = temp;			// Vertauschung
			
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

// Dieser Algorithmus nennt sich Selection Sort, und i.A. ist der Algorithmus nicht stabil,
// weil die relative Anordnung von Elementen mit gleicher Eigenschaft bleibt nicht erhalten.

// Selection Sort läuft am schnellsten, wenn der Array aufsteigend sortiert ist (bzw. "richtig" sortiert),
// und am langsamsten wenn es absteigend sortiert ist. Der Algorithmus sucht durch den ganzen Array durch, findet
// den minimalen Wert, vertauscht dieses Element. Wenn der Array genau andersum sortiert ist, muss jedes Element
// vertauscht werden. 