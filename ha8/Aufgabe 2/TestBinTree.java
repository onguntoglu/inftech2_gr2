public class TestBinTree{

	public static void main(String[] args){

		BinTree<String> binTree = new BinTree<String>("a", 
									new BinTree<String>("b",
										 new BinTree<String>("c"),
										 new BinTree<String>("d")
									),
									new BinTree<String>("e",
										null,
										new BinTree<String>("f")
									)
								 );
	 
						
		
		for (String s: binTree){
			System.out.println(s);
		}
	
		
		for (String s: binTree){
			System.out.println(s);
		}
	}

}
