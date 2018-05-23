// Die readFilm-Methode dieser Klasse liesst aus der uebergebenen Datei
// Daten ein und erzeugt daraus Film-Objekte, die sie in einem Array 
// zusammenfasst und diesen dann zurueckgibt.
// 
// Sie muessen diese Klasse nicht im Detail verstehen, um die Aufgabe 
// bearbeiten zu koennen.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Parser {

    public static Film[] readFilme(String f) {
        System.out.print("Lese Filmdaten aus Datei " + f + " ein... ");

        try {
            // Daten lesen
            BufferedReader br = new BufferedReader(new FileReader(f));
            LinkedList<String> lines = new LinkedList<String>();
            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line); // gelesene Zeile dem Zeilen-Array hinzufuegen
            }
            br.close();

            // Daten verarbeiten
            Film[] Film = new Film[lines.size()];
            for (int i = 0; i < lines.size(); i++) {
                String[] elemente = lines.get(i).split(","); // Zeile an Kommas auftrennen
                Film a = new Film(
                        elemente[0].trim(),
                        Double.parseDouble(elemente[1].trim()),
                        Integer.parseInt(elemente[2].trim()),
                        elemente[3].trim(),
                        elemente[4].trim()
                ); 
                Film[i] = a; // Filmobjekt dem Array hinzufuegen
            }

             // Array zurueckgeben
            return Film;
        } catch (IOException e) {
            System.err.println("Fehler beim Daten einlesen: " + e.getMessage());
        }
        return null; // Fehlerfall
    }

}
