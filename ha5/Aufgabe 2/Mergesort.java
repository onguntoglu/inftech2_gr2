public class Mergesort {
	private int[] arr;
	
	public Mergesort(int[] arr) {
		this.arr = arr;
	}
	
	private static void mergeEs(int[] f, int[] g, int start, int end, int p) {  // von unten nach oben zusammenfügen
    	int i = start;	
    	int j = p;
    	for (int k = start; k <= end; k++) {
    	if (i <= p-1 && j <= end) {
    	if (f[i] <= f[j]) g[k] = f[i++]; else g[k] = f[j++];
    	}
    	else {
    	if (i <= p-1) g[k] = f[i++]; else g[k] = f[j++];
    	} }
    	for (int k = start; k <= end; k++) f[k] = g[k];
    	
    	}

	
	
	public static void mergeSortRec(int[] f, int[] g, int start, int end) {
		if (start < end) {
		int p = (start + end + 1) / 2; // in Teilarrays unterteilen
		mergeSortRec(f, g, start, p-1); // linkes Teilarray unterteilen
		mergeSortRec(f, g, p, end); 	// rechtes Teilarray unterteilen
		mergeEs(f, g, start, end, p);
		} 
	}
  
    public static void sort(int[] arr) {
    	int start = 0;
    	int end = arr.length -1;
    	int[] f = arr;
    	int[] g = new int[arr.length];
    	
    	mergeSortRec(f,g,start,end);
    	
    	
    }


}
