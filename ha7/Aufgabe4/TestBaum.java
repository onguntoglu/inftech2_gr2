
public class TestBaum {

	public static void main(String[] args) {
		
		String[] stringarray = {"O","G","N","C","F","J","M","A","B","D","E","H","I","K","L"};
		
		Baum baum = new Baum(stringarray);
		baum.printPreorder();
		System.out.println();
		baum.printInorder();
		System.out.println();
		baum.printPostorder();
	}

}
