package mocks;					
								//Reverse string

public class Reversestring {
	public void m1(String a){

		int abc=a.length()-1;
		for(int i=abc;i>=0;i--)
		
		{
		System.out.print(a.charAt(i));
		}}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reversestring pune= new Reversestring();
		pune.m1("java hi");
	}

}
