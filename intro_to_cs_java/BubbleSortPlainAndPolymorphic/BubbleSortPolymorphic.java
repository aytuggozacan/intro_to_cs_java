
public class BubbleSortPolymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student first = new Student(123, "horst");
		Student second = new Student(1, "heiner");
		Student third = new Student(1778878, "susi");
		Student[] studiArray = new Student[3];
		studiArray[0] = first;
		studiArray[1] = second;
		studiArray[2] = third;
		//printArray(studiArray);
		//bubbleSort(studiArray);
		//printArray(studiArray);	
		
		Vehicle vfirst = new Vehicle(200);
		Vehicle vsecond = new Vehicle(200);
		Vehicle vthird = new Vehicle(200);
		Vehicle[] vehicleArray = {vfirst, vsecond, vthird};
		
		printArray(vehicleArray);
		bubbleSort(vehicleArray);
		printArray(vehicleArray);	

		

	}
	
	public static void printArray(ICanBeCompared[] theArray) {
		for(int i=0; i < theArray.length; i++)
			System.out.print(" " + theArray[i].toString());
		System.out.println();
	}
	
	public static void bubbleSort(ICanBeCompared[] data) {
		ICanBeCompared backup;
		for(int i=data.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j].isGreaterThan(data[j+1])) {
					backup = data[j];
					data[j] = data[j+1];
					data[j+1] = backup;
				}
			}
		}
	}


}
