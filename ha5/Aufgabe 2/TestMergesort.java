
public class TestMergesort {

	public static void main(String[] args) {
		int[] unsortArray = new int[]{81,92,30,-10,47,45,100};
		System.out.println("Unsorted array:");
		for(int i = 0; i < unsortArray.length; i++){			
			System.out.print(unsortArray[i] + " ");
		}
		System.out.println();

		Mergesort tolis = new Mergesort(unsortArray);
		tolis.sort(unsortArray); //was meint hier?
		
		
		System.out.println("Array sorted with Mergesort:");
		for (int i = 0; i < unsortArray.length; i++) 
		{ 
			System.out.print(unsortArray[i] + " ");
		}
		
		
	}

}
