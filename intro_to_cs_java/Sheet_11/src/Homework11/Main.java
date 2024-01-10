package Homework11;

import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		
		func(3);
		
		System.out.println(create(2,5));
		System.out.println(create(5,5));
		System.out.println(create(5,2));
		
		System.out.println(replace("Byzingy",'y','a'));
		System.out.println(replace("Hexxo Worxd",'x', 'l'));
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(5);
		s1.add(6);
		s1.add(5);
		s1.add(7);
		s1.add(8);
		s1.add(9);
		
		Stack<Integer> s2 = new Stack<Integer>();
		s2.add(0);
		s2.add(2);
		s2.add(0);
		s2.add(4);
		s2.add(0);
		s2.add(6);
		
		System.out.println(remove(s1, 5));
		System.out.println(remove(s2, 0));
		
		
		

	}
	public static Stack<Integer> create(int a, int b){
		// Homework 11.1
		
		Stack<Integer> stack = new Stack<Integer>();
		
		if(a<b) {
			stack.add(a);
			for(int i= 1; i < (b - a) + 1 ; i++) {
				
				int l = create(a+i, a+i).pop();
				stack.add(l);
				
			}

		}
		
		else if(a == b) {
			stack.add(a);
		}
		
		return stack;
		
	}
	
	public static void func(int n) {
//		Homework 11.2
		
		
		if(1 <= n) {
			
			for(int j = 0; j<n; j++) {
				System.out.println(n);
				
			}
			func(n-1);

		}		
	}
	
	
	public static String replace(String s, char c1, char c2) { 
		//Homework 11.3
		
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == c1) {
				
				String a = "";
				String b = "";
				a = s.substring(0,i);
				b = s.substring(i+1);
				s = a + c2+ b;
				replace(s,c1,c2);
				
			}
		}

		return s;
	}
	
	public static Stack<Integer> remove(Stack<Integer> s, int n){
//		Homework 11.4
		Stack<Integer> stack = new Stack<Integer>();

				int l = s.size();
				for(int i = 0; i < l; i++) {
					int k = s.pop();
					
					if(k != n) {
						stack.add(k);
					}
					else if(k == n) {
						break;
					}

				}
				if(!s.isEmpty()) {
					remove(s,n);
				}
				
				int p = stack.size();
				for(int j = 0; j<p; j++) {
					int h = stack.pop();
					s.add(h);
					
				}

		return s;
	}	

}
