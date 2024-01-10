
public class BubbleSortPlain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] foo = {11, 5, 102, 2, 9};
		printArray(foo);
		bubbleSort(foo);
		printArray(foo);		
	}
	
	public static void printArray(int[] theArray) {
		for(int i=0; i < theArray.length; i++)
			System.out.print(" " + theArray[i] );
		System.out.println();
	}
	
	public static void bubbleSort(int[] data) {
		int backup;
		for(int i=data.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) {
					backup = data[j];
					data[j] = data[j+1];
					data[j+1] = backup;
				}
			}
		}
	}


}
