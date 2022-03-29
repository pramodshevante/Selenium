package mocks;

public class PalindromeIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int no=121;
	int temp=no;
	int rev=0,rem;
	while(temp !=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(no==rev)
	{
		System.out.println("no is palidrome");
		
	}
	else
	{
		System.out.println("no is not palindrome");
	}
	}}