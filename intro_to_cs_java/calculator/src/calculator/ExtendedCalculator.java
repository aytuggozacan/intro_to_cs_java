package calculator;

public class ExtendedCalculator extends EasyCalculator {
	
	public int sum(int[] a) {
		int n=a[0];
		String s = "" + n;
		for ( int i=1; i<a.length; i++) {
			n = super.sum(n, a[i]);
			s += "+" + a[i];
		}
		s += " = " + n;
		System.out.println(s);
		return n;
	}
	
}
