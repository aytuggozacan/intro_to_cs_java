
public class Student implements ICanBeCompared{

	public int matrNr;
	public String name;
	
	public Student(int mnr, String n){
		matrNr = mnr;
		name = n;
	}
	
	public boolean isGreaterThan(ICanBeCompared ican) {
		boolean result = false;
		if(ican instanceof Student) {
			Student other = (Student)ican;
			result = other.matrNr < this.matrNr;
		}
		return result;
	}
	
	public String toString() {
		return "matNr: " + matrNr + " name: " + name;
	}

}
