
public class Flower {

	private double amountOfPollen = 300.0d;
	
	public double yieldPollen(double amount) {
		double returnedPollen;
		if(amount >= amountOfPollen) {
			returnedPollen = this.amountOfPollen;
			amountOfPollen = 0.0d;
		}
		else {
			returnedPollen = amount;
			this.amountOfPollen = this.amountOfPollen - amount;
		}
		return (double)returnedPollen;
	}
	
}
