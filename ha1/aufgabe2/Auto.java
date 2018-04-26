public class Auto implements Transportmittel{
    private float geschwindigkeit;

    // Konstruktor mit Eigenschaften
    public Auto(float geschwindigkeit){
        this.geschwindigkeit = geschwindigkeit;
        if(geschwindigkeit > 100 || geschwindigkeit < -50){
            this.geschwindigkeit = 0;
        }
        
    }
    
    // Getter-Methode
    public float getGeschwindigkeit(){
        return this.geschwindigkeit;
    }

    // Methode überprüft das Interval, falls die Geschwindigkeitsdiff
    // im Interval liegt, updaten
    public void beschleunigen(float geschwindigkeit){
        if(this.geschwindigkeit + geschwindigkeit > 100 || this.geschwindigkeit + geschwindigkeit < -50){
            System.out.println("Das Auto darf vorwaerts nicht schneller als 100 km/h und rueckwaerts nicht schneller als 50 km/h fahren.");
        }
        else{
            this.geschwindigkeit = this.geschwindigkeit + geschwindigkeit;
        }
    }
}