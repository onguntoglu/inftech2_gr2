public class VideoOnDemand {
    public static void main(String[] args){
        
        // Einlesen der Filme in einen Array  
        String file = "videos.db";
        Film[] angebot = Parser.readFilm(file);
        if (angebot == null) {
            System.out.println("Initialisierung fehlgeschlagen, Daten der " + file + " fehlen. Beende Programm.");
            return;
        }
        
        System.out.println("\n");
        System.out.println("\t*********************");
        System.out.println("\t*      SUPER        *");
        System.out.println("\t*      DUPER        *");
        System.out.println("\t*      VIDEOS       *");
        System.out.println("\t*                   *");
        System.out.println("\t*  ###############  *");
        System.out.println("\t*  ###+#######+###  *");
        System.out.println("\t*  ##+++#####+++##  *");
		System.out.println("\t*  ###+#######+###  *");
		System.out.println("\t*  ###############  *");
        System.out.println("\t*                   *");
        System.out.println("\t*********************");
        System.out.println();
      
        System.out.println("Willkommen bei SUPER DUPER VIDEOS!");

        // Bedienungshinweise
        System.out.println("[Mit 's' kann ein Film gesucht werden.]");
        System.out.println("[Mit 'q' kann das Programm beendet werden.]");
        System.out.println();

        // Dauerschleife mit Aktionsauswahl pro Schleifendurchlauf
        char aktion = 0;
        while(true) {
            System.out.println();
            System.out.println("Unser ueberschaubares Angebot:");
            System.out.println();
            System.out.format("%1$38s | %2$12s | %3$12s | %4$17s", "Titel", "Preis (EUR)", "Laenge (min)", "Erscheinungsdatum");
            System.out.println();
            System.out.println(" _______________________________________________________________________________________");
            for(int i=0; i<angebot.length;i++){
                System.out.format("%1$38s | %2$12.2f | %3$12d | %4$17s", 
                        angebot[i].titel, angebot[i].preis, angebot[i].laenge, angebot[i].erscheinungsdatum);
                System.out.println();
            }
            System.out.println();
            aktion = Terminal.askChar("Aktion [s/q]: ");
            System.out.println();
            if (aktion == 's') {
                // Da der Warenbestand nach Erscheinungsdatum sortiert ist, bitten wir den Nutzer um das Erscheinungsdatum statt den Titel
                String suchdatum = Terminal.askString("Bitte geben Sie den Erscheinungsdatum des gewaehlten Films ein: ");
                Film suchmuster = new Film(null, 0.0, 0, null, suchdatum); //DummyFilm zum Preisvergleich
                int filmindex = Suche.binaereSuche(suchmuster, angebot); // suchen lassen
                System.out.println();
                if (filmindex != -1) {
                    System.out.println("Sie interessieren sich fuer folgenden Film: ");
                    System.out.println(angebot[filmindex]);
                    System.out.println("\n");
                    System.out.println("\t*********************");
                    System.out.println("\t*                   *");
                    System.out.println("\t*  ---------------  *");
                    System.out.println("\t*  -             -  *");
                    System.out.println("\t*  -     PLAY    -  *");
                    System.out.println("\t*  -             -  *");
                    System.out.println("\t*  ---------------  *");
                    System.out.println("\t*                   *");
                    System.out.println("\t*********************");
                    System.out.println();
                    System.out.println("\tHinweis: Wegen Wartungsarbeiten steht der Videoplayer temporaer nicht zur Verfuegung.");
                    System.out.println("\t         Wir bitten um Ihr Verstaendnis.");
                    System.out.println();
                    Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
                } else {
                    System.out.println("Es wurde kein Film mit diesem Erscheinungsdatum gefunden.\n");
                    Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
                }
                aktion = 0;
                continue;
            } else if (aktion == 'q') {
                System.out.println("Programm wird beendet.");
                aktion = 0;
                return;
            } else {
                System.out.println("Ungueltige Eingabe.");
                Terminal.askString("Druecken Sie [ENTER] zum Fortfahren.\n");
                aktion = 0;
                continue;
            }
        }
    }
}
