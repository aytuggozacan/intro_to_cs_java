package calculator;

public class EasyCalculator {
	public int sum( int a, int b) {
		int n = a;
		String s = a + "a" + b + " = " + a;
		for (int i=0; i<b; i++) {
			n +=1;
			s += " + 1";
		}
		s += " = " + n;
		System.out.println(s);
		return n;
	}

	public int multiply(int a, int b) {
		int n = a;
		String s = a + "*" + b + " = " + a;
		for (int i=1; i<b; i++) {
			n = sum(n,a);
			s += " + " + a;
		}
		s += " = " + n;
		System.out.println(s);
		return n;
	}
	
}
