import java.util.Iterator;

public class Matrix<T> implements Iterable<T> {

	private T[][] mat;
	private char iteratorMode = 'f';
	
	public Matrix(T[][] mat){
		this.mat = mat;
	}
	
	public void setIteratorMode(char val) {
		this.iteratorMode = val;
	}
	
	public Iterator<T> iterator(){
		if (iteratorMode == 'b') return new MatrixBackwardIterator();
		else return new MatrixForwardIterator();
		
	}
	
	
	private class MatrixForwardIterator implements Iterator<T> {
		
		private int itxpos;
		private int itypos;
		
		
		public MatrixForwardIterator(){
			itxpos = 0;
			itypos = 0;
		}

		
		public boolean hasNext() {
			
			if (mat[itxpos][itypos] == null) return false; 
			else return true;
		}
		
		public T next() {
			if (itypos == mat[0].length - 1) { // if i reach the last column
				if (itxpos == mat.length -1) { // if i reach the last row
					//System.out.println("Last Element.. No more elements!");
					T temp = mat[itxpos][itypos];
					mat[itxpos][itypos] = null; //Condition of hasNext() to -> false 
					return temp;
				} else {  // if last column but not last row, for the next element i have to
				int tempYpos = itypos ; 
				itypos = 0;  // make the column coordinate zero
				return mat[itxpos++][tempYpos]; //and add 1 to row coordinate
				}
				
			} else { // if not last column
				
				return mat[itxpos][itypos++];
			}
			
			
			}
		public void remove() {
			
		}
	}
	
	
	
	private class MatrixBackwardIterator implements Iterator<T> {
		
		private int itxpos;
		private int itypos;
		
		
		public MatrixBackwardIterator(){
			itxpos = mat.length - 1;
			itypos = mat[0].length - 1;
		}

		
		public boolean hasNext() {
			
			if (mat[itxpos][itypos] == null) return false; 
			else return true;
		}
		
		public T next() {
				if(itypos == 0) {
					if(itxpos == 0) {
						//System.out.println("Last Element.. No more elements!");
						T temp = mat[itxpos][itypos]; 
						mat[itxpos][itypos] = null;
						return temp;
					} else {
						int tempPosX = itxpos;
						int tempPosY = itypos;
						itxpos -= 1;
						itypos = mat[0].length - 1;
						return mat[tempPosX][tempPosY];
					} 
				}else {
						return mat[itxpos][itypos--];
					}
			
			
			
		}
		public void remove() {
			
		}
	
		
	}
	
	
	

}
