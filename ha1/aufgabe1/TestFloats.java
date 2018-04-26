public class TestFloats{
    public static void main(String[] args) {
        Floats[] arr = new Floats[10]; //Erzeugt Floats-Array
        for (int i = 0; i < arr.length; i++) {

            //Bildungsregel und init Float-Arrays mit dummy
            float[] dummy = {1.1f + i, -i*9.5f , 10 - i + 0.1f*i*i}; 
            arr[i] = new Floats(dummy);
        } 

        // Objekt mit dem größten Index
        arr[arr.length - 1].setKleinstes();
        arr[arr.length - 1].ausgabeRekursiv(0);
    }
}