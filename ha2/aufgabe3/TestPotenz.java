public class TestPotenz{
    public static void main(String[] args) {
        double potenz1a = Math.pow(2.2, 10);
        double potenz1b = Math.pow(3, 0);

        double potenz2a = Potenz.potenzIterativ(2.2, 10);
        double potenz2b = Potenz.potenzIterativ(3, 0);

        double potenz3a = Potenz.potenzIterativ(2.2, 10);
        double potenz3b = Potenz.potenzIterativ(3, 0);

        System.out.println("Berechnungserbegnis mit Math.pow:  "+ "1: " + potenz1a + " | 2: " + potenz1b);
        System.out.println("Berechnungserbegnis mit Potenz.potenzIterativ:  "+ "1: " + potenz2a + " | 2: " + potenz2b);
        System.out.println("Berechnungserbegnis mit Potenz.potenzRekursiv:  "+ "1: " + potenz3a + " | 2: " + potenz3b);

    }
}