public class Suche  {    
    // Suchmethode
    public static int binaereSuche(Film suchObjekt, Film[] array){
        int start = 0;              // der Anfang des Arrays
        int end = array.length - 1; // das Ende des Arrays
        int s;                      // Positionvariable    
        int index = -1;             // Index

        while(start <= end && index == -1){ 
            s = (start + end)/2;    // aktuelle Position, im sortierten Array die Mitte zwischen Start und End
            if(suchObjekt.compareTo(array[s]) == 0) index = s; // Suche fertig, Element gefunden
            else{                   // Wenn Element nicht gefunden ist
                if(suchObjekt.compareTo(array[s]) < 1) end = s - 1; // Wenn Element im sortierten Array links der aktuellen Position ist, setze Ende ein Element links der Position
                else start = s + 1;                             // Wenn Element im sortierten Array rechts der aktullen Position ist, setze Start ein Element rechts der Poisiton
            }
        }
        return index;               // index Ausgeben wenn erfolgreich, -1 wenn nicht
    }
}
