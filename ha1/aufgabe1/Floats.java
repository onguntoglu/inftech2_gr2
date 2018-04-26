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
        this.kleinstes = 
    }
}