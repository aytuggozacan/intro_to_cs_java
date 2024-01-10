
public class StatementsDemo {

	public static void main(String[] args) {
		//double[] a = new double[3];
		double[] a = {1.0d,2.0d,-1.0d};
		//a[0]=1.0d;
		//a[1]=2.0d;
		//a[2]=-1.0d;
		double[][] A = {{1.0d,2.0d,-1.0d},{1.0d,2.0d,-1.0d},
				{1.0d,2.0d,-1.0d}};
		double[] result = multMatVec(a, A, 3);
		printArray(result);
		double result2 = sine(0.5d);
		System.out.println(result2);
	}
	
	
	//sin(x)=sum_n=0 (-1)^n x^(2n+1) / (2n+1)!
	public static double sine(double x) {
		double result = x;
		long factorials = 1;
		double powersOfX = x;
		for(int n=1; n<20; n++) {
			powersOfX = powersOfX*x*x;
			factorials = factorials*(2*n+1)*(2*n);
			if(n % 2 == 1) {//n is odd
				result = result - powersOfX/(double)factorials;
			} else {//n is even
				result = result + powersOfX/(double)factorials;
			}
		}
		return result;
	}
	
	
	public static void printArray(double[] theArray) {
		System.out.print("(");
		for(int n=0; n<theArray.length; n++) {
			System.out.print(theArray[n] + " ");
		}
		System.out.println(")");
	}
	
	
	public static double[] multMatVec(double[] a, double[][] A,
			int dim) {
		if(a.length != A.length) {
			//TODO: treat that exceptional condition
			if(a.length != dim) {
				//TODO: treat that exceptional condition too
			}
		}
		double[] result = new double[dim];
		for(int m=0; m<dim; m++) {
			for(int n=0; n<a.length; n++) {
				result[m] = result[m] + A[m][n] * a[n];
			}
		}
		return result;
	}

	//A:matrix:nxn , a:vector:n ; A*a:vector:n
	//Vector
	//double[]
	//String[][][]
}
