

public class StatementsAndOperatorsDemo {

	public static void main(String[] args) {
		StatementsAndOperatorsDemo demo = new StatementsAndOperatorsDemo();
		int theResult = demo.minimum(5, 10);
		System.out.println("minimum: " + theResult);
		long theResult2 = 0;
		try{
			theResult2 = StatementsAndOperatorsDemo.factorial(-5);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("factorial: " + theResult2);
		theResult2 = demo.factorialWithFor(5);
		System.out.println("factorial with for: " + theResult2);
		double theResult3 = demo.power(2.0d, 8);
		System.out.println("power: " + theResult3);
		theResult3 = demo.powerWithWhile2(2.0d, 8);
		System.out.println("power with while: " + theResult3);
		theResult3 = demo.exp(1.0d);
		System.out.println("exp:" + theResult3);
		theResult3 = demo.expMoreEfficient(1.0d);
		System.out.println("exp (more efficient):" + theResult3);
		theResult3 = demo.cosine(3.141d);
		System.out.println("cosine: " + theResult3);
		theResult3 = demo.sine(3.141592653589d);
		theResult3 = demo.sine(8.0d); //does not work (taylor series only valid for small values!		
		System.out.println("sine: " + theResult3);
		double[] firstVec = new double[3];
		double[] secondVec = {1.0d, 1.0d, 1.0d};
		firstVec[0]=1.0d;
		firstVec[1]=2.0d;
		firstVec[2]=3.0d;
		theResult3 = demo.scalarProduct(firstVec, secondVec);
		System.out.println("scalar product: " + theResult3);
		double[][] m = { {1.0d, 0.0d, 0.0d}, {0.0d, 1.0d, 0.0d}, {0.0d, 0.0d, 1.0d} };
		double[] theResult4 = demo.multMatVec(m, firstVec);
		System.out.println("matrix  *  vector: ");
		printArray(theResult4);
		firstVec[0]=1.0d;
		firstVec[1]=0.0d;
		firstVec[2]=0.0d;
		secondVec[0]=0.0d;
		secondVec[1]=1.0d;
		secondVec[2]=0.0d;
		theResult4 = demo.vectorProduct(firstVec, secondVec);
		System.out.println("vector product: ");
		printArray(theResult4);	
		theResult3 = demo.empiricalExpectation(firstVec);
		System.out.println("expectation: " + theResult3);
		theResult3 = demo.empiricalVariance(firstVec);
		System.out.println("variance :" + theResult3);
		double[] result4;
		try{
			result4 = quadraticEquation(2.0d, 8.0d, 3.0d );
			System.out.println("quadratic: ");
			printArray(result4);
		} catch (Exception e){
			System.out.println("some error occurred");
		}
	}
	
	public int minimum(int a, int b){
		int result;
		if(a < b)
			result = a;
		else
			result = b;
		return result;
	}
	
	public static long factorial(int a) throws Exception{
		long result = 1;
		if(a<0)
			throw new Exception();
		while(a > 1){
			result = result * a;
			a = a - 1;
		}
		return result;
	}
	
	public long factorialWithFor(int a){
		long result = 1;
		for(int i=1; i<=a; i++){
			result = result * i;
		}
		return result;
	}
	
	public double power(double argument, int m){
		double result = 1.0d;
		for(int i=0; i<m; i++){
			result = result * argument;
		}
		return result;
	}
	
	public double powerWithWhile(double argument, int m){
		double result = 1.0d;
		int i=0;
		while(i<m){
			result = result * argument;
			i++;
		}		
		return result;
	}
		
	public double powerWithWhile2(double argument, int m){
		double result = 1.0d;
		while(m>0){
			result = result * argument;
			m--;
		}		
		return result;
	}
		
	public double exp(double x){
		double result = 1.0d;
		for(int n=1; n<20; n++){
			result = result + (power(x,n) / (double)(factorialWithFor(n))); //incredibly inefficient!
		}
		return result;
	}
	
	public double expMoreEfficient(double x){
		double result = 1.0d;
		double xToThePower = 1.0d; //x^0 = 1
		long factorial = 1; //0! = 1
		for(int n=1; n<20; n++){
			xToThePower = xToThePower * x; 
			factorial = factorial * n;
			result = result + (xToThePower / (double)(factorial)); 
		}
		return result;
	}
		
	public static double[] quadraticEquation(double a, double b, double c) throws Exception{
		double[] result = new double[2]; //result[0]: first zero; result[1]: second zero
		double discriminant = b*b -4*a*c;
		if((discriminant < 0) || (a == 0.0d))
			throw new Exception();
		else{
			result[0]=(-b + Math.sqrt(discriminant)) / (2.0d * a);
			result[1]=(-b - Math.sqrt(discriminant)) / (2.0d * a);
		}
		return result;
	}

	public double cosine(double argument){
		double result = 1.0d;
		double y = 1.0d;
		for(int n=1; n<11; n++){
			y = y * argument * argument; 
			if(n % 2 == 1){ // n is odd
				result = result - y / (double)(factorialWithFor(2*n));
			} else {  // n is even
				result = result + y / (double)(factorialWithFor(2*n));
			}
		}
		return result; 
	}
	
	public double sine(double argument){
		double result = argument;
		double y = argument;
		for(int n=1; n<30; n++){
			y = y * argument * argument; 
			if(n % 2 == 1){ // n is odd
				result = result - y / (double)(factorialWithFor(2*n+1));
			} else {  // n is even
				result = result + y / (double)(factorialWithFor(2*n+1));
			}
		}
		return result; 
	}
	
	public double scalarProduct(double[] a, double[] b){
		double result = 0.0d;
		if(!(a.length==b.length))
			System.out.println("error!"); //todo: better error handling!!!!
		for(int i=0; i < a.length; i++){
			result = result + a[i]*b[i];
		}
		return result; 
	}
	
	public static void printArray(double[] theArray){
		for(int i=0; i<theArray.length; i++)
			System.out.print(" " + theArray[i]);
		System.out.println();
	}
	
	public double[] multMatVec(double[][] matrix, double[] vector){
		double[] result = new double[3];
		//todo: check dimensions!
		for(int m=0; m<3; m++){			
			for(int n=0; n<3; n++){
				result[m] = result[m] + matrix[m][n] * vector[n];
			}
		}
		return result; 
	}
	
	public double[] vectorProduct(double[] a, double[] b){
		double[] result = new double[3];
		result[0] = a[1]*b[2]-a[2]*b[1];
		result[1] = a[2]*b[0]-a[0]*b[2];
		result[2] = a[0]*b[1]-a[1]*b[0];
		return result;
	}
	
	public double empiricalExpectation(double[] x){
		double result = 0.0d;
		double oneOverN = 0.0d;
		if(x.length >= 1)
			oneOverN = 1.0d / (double)(x.length);
		else
			System.out.println("the array is empty!"); //todo: better error handling!
		for(int i=0; i<x.length; i++){
			result = result + x[i];
		}
		result = result * oneOverN;
		return result; 
	}

	public double empiricalVariance(double[] x){
		double result = 0.0d;
		double oneOverNMinusOne = 0.0d;
		if(x.length >= 2)
			oneOverNMinusOne = 1.0d / (double)(x.length - 1);
		else
			System.out.println("the array is too short!"); //todo: better error handling!
		double expectation = empiricalExpectation(x);
		for(int i=0; i<x.length; i++){
			result = result + (x[i] - expectation) * (x[i] - expectation);
		}
		result = result * oneOverNMinusOne;
		return result; 	
	}
	
}
