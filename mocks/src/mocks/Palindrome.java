package mocks;

public class Palindrome {
	public static boolean isPalindrome (String str) {
		
		int i=0,j=str.length()-1;
		while (i<j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
				
	}
	public static void main(String[]args) {
		String str = "MOm";
		str=str.toLowerCase();
		
		if (isPalindrome(str))
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
