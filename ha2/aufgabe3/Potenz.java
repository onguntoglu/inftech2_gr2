public class Potenz{
    public static double potenzIterativ(double a, int n){
        int counter = 1;    // counter für Iteration
        double result = a;  // Ergebnis initializieren mit a für Fall n = 1
        if (a < 0 || n < 0) return -1;  // Voraussetzung
        else if(n == 0){
            return 1;       // n = 0;
        }
        else{
            while(n != counter){    // iterative Berechnung vom Potenz
                result = result*a;
                counter++;
            }
        }
        return result;      // Ergebnis zurückgeben
    }

    public double potenzRekursiv(double a, int n){
        if (a < 0 || n < 0) return -1;
        else if(n == 0){                        // Bedingung(1)
            return 1;
        }else{
            return a * potenzRekursiv(a, n-1);  // Objektmethode ruft potenzRekursiv bis Bedingung(1) erfüllt ist
        }
    }
}