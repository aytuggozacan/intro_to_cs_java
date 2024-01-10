package Sheet12;

public class MyDynamicArray {


	private int[] a;
	private int lastIndex;
	
	public MyDynamicArray(int size) {
		
		this.a = new int[size];
		this.lastIndex = 0;
		
	}
	
	public MyDynamicArray() {
		
		this.a = new int[1];
		this.lastIndex = 0;

	}
	
	public int size(){
		
		return this.lastIndex;
		
	}
	
	public int get(int i) {
		
		return this.a[i];
		
	}
	
	public void add(int value) {
		
		if(this.a.length == lastIndex) {
			reallocate();
		}
		
		this.a[lastIndex] = value;
		lastIndex++;

	}
	
	public void reallocate() {
		
		int[] newArray = new int[this.a.length*2];
		
		for(int i = 0; i < this.a.length; i++) {	
			newArray[i] = this.a[i];	
		}
		a = newArray;
	}
	
	public void printArray() {
		for(int i : a) {
			
			System.out.print(i +" ");
		}
		
		System.out.println();
	}
	
	public void downsize() {

		int[] smallArray = new int[this.a.length/2];
		
		for(int i = 0; i < this.a.length; i++) {	
			if(a[i] != 0) {
				smallArray[i] = this.a[i];
			}				
		}
		a = smallArray;
		
	}
	
	public void removeElem(int Elem) {
		int[] copy = new int[this.a.length];

		for (int i = 0, j = 0; i < a.length; i++) {				    
			if (a[i] != Elem) {				        
				copy[j++] = a[i];	
				this.lastIndex = this.lastIndex - 1;
			}
		}
		this.a = copy;	
		
		if(this.lastIndex < this.a.length/2) {
			downsize();
		}

			
		
			
		
		
		}

	}














