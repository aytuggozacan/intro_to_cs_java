
public class Vehicle implements ICanBeCompared{
	public int horsePower;
	
	public Vehicle(int hp) {
		horsePower = hp;
	}
	
	public boolean isGreaterThan(ICanBeCompared ican) {
		boolean result = false;
		if(ican instanceof Vehicle) {
			Vehicle other = (Vehicle)ican;
			result = other.horsePower < this.horsePower;
		}
		return result;
	}

	public String toString() {
		return "horsepower (harrr) " + horsePower;
	}
}
