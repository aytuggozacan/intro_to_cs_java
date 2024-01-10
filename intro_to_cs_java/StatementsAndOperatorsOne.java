
public class StatementsAndOperatorsOne {

	public static void main(String[] args) {
		StatementsAndOperatorsOne s = new StatementsAndOperatorsOne();
		int result1;
		result1 = s.minimum(2,5);
		System.out.println(result1);
		result1 = s.factorial(5);
		System.out.println(result1);
		result1 = s.factorial2(5);
		System.out.println(result1);
		double result2 = s.power(2.0d,10);
		System.out.println(result2);
		result2 = s.exp(1.0d);
		System.out.println(result2);
	
	}

	public int minimum(int a, int b) {
		int result;
		if(a < b)
			result = a;
		else
			result = b;
		return result;
	}
	
	
	public int minimum2(int a, int b) {
		if(a < b)
			return a;
		else
			return b;
	}
	
	public int factorial(int a) {
		int result = 1; 
		for(int i=1; i<=a; i++) {
			result = result * i;
		}
		return result;
	}
	
	public int factorial2(int a) {
		int result = 1; 
		//int i=1;
		//while(i<=a) {
		//	result = result * i;
		//	i++;
		//}	
		while(a>1) {
			result = result * a;
			a = a - 1;
		}
		return result;
	}
	
	public double power(double argument, int m) {
		double result = 1.0d;
		for(int i=0; i<m; i++) {
			result = result * argument;
		}
		return result; 
	}
	
	
	public double exp(double x) {
		double result = 1.0d;
		for(int n=1; n<20; n++) {
			result = result + (power(x,n)/(double)(factorial(n)));
		}
		return result;
	}
	
	
	

	
}
