
public class BAFDemo {

	public static void main(String[] args) {
		FlyingInsect someFlyingInsect;
		someFlyingInsect = new FlyingInsect();
		//someFlyingInsect.fly(20);
		//
		LittleBee maja = new LittleBee();
		LittleBee willi = new LittleBee();
		//maja.sting();
		//willi.snooze();
		//maja.fly(30); //******
		//
		AngryHornet horst = new AngryHornet();
		//horst.sting();
		//
		ICanSting someICanSting;
		//someICanSting = horst; 
		//someICanSting.sting();
		//
		FlyingInsect someFlyingInsect2;
		//someFlyingInsect.fly(400);
		someFlyingInsect2 = horst;
		someFlyingInsect2.fly(400);
	}

}
