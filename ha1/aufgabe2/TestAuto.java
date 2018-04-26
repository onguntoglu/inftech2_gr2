public class TestAuto{
    public static void main(String[] args) {
        Auto auto = new Auto(0); // Erzeugt auto mit Geschwindigkeit 0
        for (int i = 0; i < 15; i++) {
            auto.beschleunigen(8); // Beschleunigen um 8
            System.out.println(auto.getGeschwindigkeit() + " km/h"); // Ausgabe
        }
    }
}