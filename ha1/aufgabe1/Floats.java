public class Floats{
    private float[] werte;
    private float kleinstes;

    public Floats(float[] werte){
        this.werte = werte;
    }

    public float kleinere(float x, float y){
        if(Math.abs(x) < Math.abs(y)){
            return x;
        }
        else return y;
    }

    public void setKleinstes(){
        this.kleinstes = this.werte[0];
        for (int i = 1; i < this.werte.length; i++) {
            this.kleinstes = kleinere(this.kleinstes, this.werte[i]);
        }
    }

    public void ausgabeRekursiv(int index){
        for (int i = index; i < this.werte.length; i++) {
            System.out.println(this.werte[i]);
        }
        System.out.println(this.kleinstes);
    }
}
