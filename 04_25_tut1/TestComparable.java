public class TestComparable{        
    public static void main(String[] args){
        Comparable c = new Rechteck(2.0, 4.0);
        Rechteck r = new Rechteck(3.0, 2.0);
        Object o = new Rechteck(4.0, 2.0);

        System.out.println("o, c " + ((Rechteck)o).compareTo(c));
        System.out.println("r, c " + r.compareTo(c));  
    }
}