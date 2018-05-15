public class Suche  {    
    // Suchmethode
    public static int binaereSuche(Film suchObjekt, Film[] array){
        int start = 0;
        int end = array.length - 1;
        int s;
        int index = -1;

        while(start <= end && index == -1){
            s = (start + end)/2;
            if(suchObjekt.compareTo(array[s]) == 0) index = s;
            else{
                if(suchObjekt.compareTo(array[s]) < 1) end = s - 1;
                else start = s + 1;
            }
        }
        return index;
    }
}
