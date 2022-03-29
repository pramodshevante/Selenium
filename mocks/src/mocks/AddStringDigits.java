package mocks;

public class AddStringDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		String str="sgd44ddf55";
		int add=0;
		for(int i=0;i<str.length();i++) {
			
			if (Character.isDigit(str.charAt(i))) {
				add +=
						
						Integer.parseInt(String.valueOf(str.charAt(i)));
				
			}
		}
			System.out.println(add);
	}

}
