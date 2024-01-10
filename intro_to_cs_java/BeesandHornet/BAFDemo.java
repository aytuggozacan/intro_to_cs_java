
public class BAFDemo {

	public static void main(String[] args) {
		FlyingInsect someFlyingInsect;
		someFlyingInsect = new FlyingInsect();
		someFlyingInsect.fly(20);
		LittleBee maja = new LittleBee();
		LittleBee willi = new LittleBee();
		maja.sting();
		willi.snooze();
		AngryHornet horst = new AngryHornet();
		horst.sting();
		ICanSting someICanSting;
		someICanSting = horst; 
		someICanSting.sting();
		FlyingInsect someFlyingInsect2;
		someFlyingInsect2 = maja;
		someFlyingInsect2.fly(400);
	}

}
