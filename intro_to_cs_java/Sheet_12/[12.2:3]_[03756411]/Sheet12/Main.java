package Sheet12;

public class Main {

	public static void main(String[] args) {
		MyDynamicArray arr1 = new MyDynamicArray();
		
		arr1.add(1);
		arr1.add(1);
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(1);
		
		arr1.printArray();
		arr1.removeElem(1);
		arr1.printArray();
		
		
		
	}

}
