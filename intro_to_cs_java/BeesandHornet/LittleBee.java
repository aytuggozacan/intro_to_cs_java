
public class LittleBee extends FlyingInsect implements ICanSting{

	int collectedPollen = 0;
	
	public void sting() {
		System.out.println("little stingy");
	}
	
	public void snooze() {
		System.out.println("snoooooze!");
	}
}
