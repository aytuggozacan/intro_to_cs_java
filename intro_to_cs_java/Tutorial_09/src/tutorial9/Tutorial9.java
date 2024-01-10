package tutorial9;

public class Tutorial9 {

	public static void main(String[] args) {
	System.out.println(myfunction("aabbcdcaddcd", "bc"));
	
}
public static String myfunction(String s1, String s2) {
	
	String result = "";
	for(int i = 0; i < s1.length(); i++) {
		boolean exist = false;
		for(int j = 0; j < s2.length(); j++) {
			if(s1.charAt(i) == s2.charAt(j)) {
				exist = true;
				break;
			}
			
		}
		if (exist == false) {
			result += s1.charAt(i);
		}
		
	}
	
	
	
	
	return result;
	
	
}


}
