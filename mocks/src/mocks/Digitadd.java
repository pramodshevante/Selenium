package mocks;

public class Digitadd {
	public static void main(String[] args) {
		String str = "abec86sd99";
		int add = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				add += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(add);
	}

}



