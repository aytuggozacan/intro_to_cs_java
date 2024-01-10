package calculator;

public class Main {

	public static void main(String[] args) {
		
		EasyCalculator easyCalc = new EasyCalculator();
		ExtendedCalculator extendedCalc = new ExtendedCalculator();
		
		easyCalc.sum(2,  3);
		System.out.println("=====");
		
		easyCalc.multiply(2, 4);
		System.out.println("=====");
		
		int[] addenda = new int[] {2, 3, 4};
		extendedCalc.sum(addenda);
		System.out.println("=====");	
		
	}

}
