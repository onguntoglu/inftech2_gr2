public class Potenz{
    public static double potenzIterativ(double a, int n){
        int counter = 1;
        double result = a;
        if (a < 0 || n < 0) return -1;
        else if(n == 0){
            return 1;
        }
        else{
            while(n != counter){
                result = result*a;
                counter++;
            }
        }
        return result;
    }

    public double potenzRekursiv(double a, int n){
        if (a < 0 || n < 0) return -1;
        else if(n == 0){
            return 1;
        }else{
            return a * potenzRekursiv(a, n-1);
        }
    }
}