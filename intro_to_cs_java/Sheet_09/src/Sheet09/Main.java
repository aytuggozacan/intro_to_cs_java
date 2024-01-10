package Sheet09;

public class Main {

	public static void main(String[] args) {
	
		
		System.out.println(remove("abcdbcd", 'c'));
		System.out.println(mostFrequent("abcdbcd"));
		System.out.println(secondMostFrequent("abcdbcd"));
		System.out.println(secondMostFrequent("abbcdbcd"));
		
	}

	//Homework 9.1
	public static String remove(String s, Character c) {
		
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			boolean exist = false;
			if(c == s.charAt(i)) {
				exist = true;
			}
			if (exist == false) {
				result += s.charAt(i);
			}
		}
		
		return result;
		
	}
	//Homework 9.2
	public static Character mostFrequent(String s) {
		String c = "";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			
			String s2 = remove(s, s.charAt(i));
			count = s2.length();
			
			for(int j = 0; j < s.length(); j++) {
				String s3 = remove(s, s.charAt(j));
				if(s3.length() < count) {
					c += s.charAt(j);	
				}
			}		
			}
		return c.charAt(0);

	}
	//Homework 9.3
	public static Character secondMostFrequent(String s) {
		
		Character c = mostFrequent(s);
		String s2 = remove(s, c);
		return mostFrequent(s2);
		
	}
	

	
}
