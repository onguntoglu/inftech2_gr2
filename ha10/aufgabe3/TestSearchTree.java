public class TestSearchTree{
    public static void main(String[] args){
        SearchTree<String> tree = new SearchTree<String>();
        tree.add(3,"alex");
        tree.add(2,"bill");
        tree.add(15,"oliver");
        tree.add(7,"basil");
        tree.add(0,"phil");
        tree.add(4,"moriz");
        tree.toString();
        // 1-elementiger Baum
        System.out.println("----------------\n");
        System.out.println("1-elementiger Baum");
        tree.add(4,"Donnerstag");
        int n = 6;  
        System.out.println("Baum:\n"+tree);
        System.out.println("Anzahl der Knoten < "+n+": "+ tree.countSmaller(n));        
        System.out.println("Delete Knoten < "+n+":"); 
        tree.deleteSmaller(n);
        System.out.println(tree);  

        // leerer Baum
        System.out.println("----------------\n");
        System.out.println("leerer Baum");
        n = 4;
        System.out.println("Baum:\n "+tree);  
        System.out.println("Anzahl der Knoten < "+n+": "+ tree.countSmaller(n));        
        System.out.println("Delete Knoten < "+n+":"); 
        tree.deleteSmaller(n);
        System.out.println(tree);
        
        // >= 6 Elementen
        System.out.println("----------------\n");
        System.out.println("mehrelementiger Baum");
        
        // Ihr Code
    }
}
