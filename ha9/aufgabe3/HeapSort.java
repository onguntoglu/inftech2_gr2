
public class HeapSort {
	
	private char [] nodes;
	
	public HeapSort(char [] nodes) {
		this.nodes = nodes;
		
	}
	
	public void buildHeap() {
		int endIdx = nodes.length;
		
		// build heap (rearrange array)
		for(int curIdx = endIdx/2 -1; curIdx>=0 ; curIdx--) {
			heapify(curIdx,endIdx);
		}
	}
	
	private void heapify(int curIdx, int endIdx) { 
		
		int largest = curIdx; 
		int left = 2*curIdx + 1;
		int right = 2*curIdx + 2;
		
		if(left < endIdx && nodes[left] > nodes[largest]) {
			largest = left;
		}
		
		if(right < endIdx && nodes[right] > nodes[largest]) {
			largest = right;
		}
		
		if(largest != curIdx) {
			char temp = nodes[curIdx];
			nodes[curIdx] = nodes[largest];
			nodes[largest] = temp;
			
			heapify(largest, endIdx);
			
		}
				
		
	}
	
	public void heapSort() {
		int endIdx = nodes.length;
		
		// build heap (rearrange array)
		for(int curIdx = endIdx/2 -1; curIdx>=0 ; curIdx--) {
			heapify(curIdx,endIdx);
		}
		
		// one by one element extract from heap
		for(int curIdx = endIdx-1; curIdx >= 0; curIdx--) {
			
			//move root to end
			char temp = nodes[0];
			nodes[0] = nodes[curIdx];
			nodes[curIdx] = temp;
			
			//heapify on the reduced heap
			heapify(0,curIdx);
		}
		
	}
	
}
