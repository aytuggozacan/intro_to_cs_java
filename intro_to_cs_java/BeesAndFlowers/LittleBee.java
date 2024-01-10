
public class LittleBee extends FlyingInsect implements ICanSting{

	double collectedPollen = 0.0d;
	public int numberOfAntlers;
	public static final int TYPICL_NUMBER_OF_ANTLERS = 2;
	
	public LittleBee(int noOfAntlers) {
		numberOfAntlers = noOfAntlers;
	}
	
	public LittleBee() {
		numberOfAntlers = TYPICL_NUMBER_OF_ANTLERS;
	}
	
	public void collectPollenPolite(Flower flower, double amount) {
		double harvestedPollen;
		harvestedPollen = flower.yieldPollen(amount);
		collectedPollen = collectedPollen + harvestedPollen;
	}
	
	
	public void collectPollen(Flower flower, double amount) {
		double harvestedPollen;
		double available = flower.amountOfPollen;
		if(amount <= available) {
			harvestedPollen = flower.amountOfPollen;
			flower.amountOfPollen = 0.0d;
		}
		else {
			harvestedPollen = amount;
			flower.amountOfPollen = flower.amountOfPollen - amount;
		}			
	}
	
	public void fly() {
		System.out.println("bee-brummmmmmm");
	}
	
	public void fly(int howFast) {
		System.out.println("bee-brummmmmmm, sooo fast: " + howFast);
	}

	public void sting() {
		System.out.println("little stingy");
	}
	
	public void snooze() {
		System.out.println("snoooooze!");
	}
}
