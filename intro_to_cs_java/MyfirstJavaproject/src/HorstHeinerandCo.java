
public class HorstHeinerandCo {

	public static void main(String[] args) {
		int horst;
		int heiner;
		int fritz;
		horst = 101;
		fritz = 23;
		heiner = 15;
		System.out.println(heiner);
		heiner = fritz + horst;
		System.out.println(heiner);
		fritz = doSelfSumSquare(5);
		System.out.println(fritz);
		if (fritz < 200)
			heiner = 2999;
		else 
			heiner = 0;
		System.out.println(heiner);
        while (fritz > 0) {
        	fritz = fritz - 1;
        	System.out.println(fritz); 
        }
	}
	public static int doSelfSumSquare(int someNumber) {// f(x) = (x+x)**2 
		int a;
		a = someNumber + someNumber;
		a = a * a;
		return a;		
	}

}
