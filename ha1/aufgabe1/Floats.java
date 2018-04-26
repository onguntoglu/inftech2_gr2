public class Floats{
    private float[] werte;
    private float kleinstes;

    // Konstruktor für Klasse
    public Floats(float[] werte){
        this.werte = werte;
    }

    // Vergleicht zwei Werten
    public float kleinere(float x, float y){
        // Math.abs() für Absolutwerten
        if(Math.abs(x) < Math.abs(y)){
            return x;
        }
        else return y;
    }

    // Init kleinstes mit dem ersten Wert im Array,
    // jeder Wert wird mit dem tatsächlichen kleinstes verglichen
    // falls gültig, kleinstes wird überschrieben.
    public void setKleinstes(){
        this.kleinstes = this.werte[0];
        for (int i = 1; i < this.werte.length; i++) {
            this.kleinstes = kleinere(this.kleinstes, this.werte[i]);
        }
    }

    // Ausgabe des Arrays
    public void ausgabeRekursiv(int index){
        for (int i = index; i < this.werte.length; i++) {
            System.out.println(this.werte[i]);
        }
        System.out.println(this.kleinstes);
    }
}
