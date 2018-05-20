import com.sun.org.apache.bcel.internal.generic.SWAP;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class Film  implements Comparable {
    
    // Attribute
    public String titel;
    public double preis; // in EUR
    public int    laenge; // in min
    public String beschreibung;
    public String erscheinungsdatum; // ISO-8601 (JJJJ-MM-TT)
    
    // Konstruktor
    public Film(String titel, double preis, int laenge, String beschreibung, String erscheinungsdatum) {
        this.titel = titel;
        this.preis = preis;
        this.laenge = laenge;
        this.beschreibung = beschreibung;
        this.erscheinungsdatum = erscheinungsdatum;
    }
    
    // Methoden
    public String toString() {
        return  "Film={" + 
                "titel=" + this.titel + "," +
                "preis=" + this.preis + "," +
                "laenge=" + this.laenge + "," +
                "beschreibung=" + this.beschreibung + "," +
                "erscheinungsdatum=" + this.erscheinungsdatum +
                "}";
    }
    
    public int compareTo(Comparable other) {
        if(!(other instanceof Film)){
            int value = 0;
            return value;
        }
        else{

            int value = this.titel.compareTo(other.titel);
            return value;
        }        
    }

    public static void MySort(Comparable[] f){
        int min;    // Position for Minimum
        int select; 
        int end = f.length - 1; // End of array
        for(int i = 0; i < end; i++){ // Traverse the array
            min = i;
            for(select = i; select <= end; select++){
                if(f[select] < f[min]) min = select;
            }
            swap(f,i,min);
        }
    }
    
}
