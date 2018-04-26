public class Rechteck implements Comparable{
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite){
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getFlaecheninhalt(){
        double flaecheninhalt = this.laenge * this.breite;
        return flaecheninhalt; 
    }

    public int compareTo(Comparable c){
        if(c instanceof Rechteck){
            if(this.getFlaecheninhalt() < ((Rechteck)c).getFlaecheninhalt()){
                return -1;
            }

            if(this.getFlaecheninhalt() == ((Rechteck)c).getFlaecheninhalt()){
                return 0;
            }

            if(this.getFlaecheninhalt() > ((Rechteck)c).getFlaecheninhalt()){
                return 1;
            }
        }
    }
}