public class Film  {
    
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
    public String toString(){
        String str = "Titel: " + titel + " Preis(EUR): " + Double.toString(preis) + " Laenge(min): " + Integer.toString(laenge) + " Beschreibung: " + beschreibung + " Erscheinungsdatum: " + erscheinungsdatum;
        return str;
    }

    public int compareTo(Film o){
        int val = this.erscheinungsdatum.compareTo(o.erscheinungsdatum);
        return val;
    }
}
