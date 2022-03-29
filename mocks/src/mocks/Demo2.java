package mocks;

public class Demo2 {
	
	//non static method with boolean return type and 0 args 
	
	public boolean m1() {
		
		String a="selenium";
		String b="selenium";
		
		boolean abc=a.equals(b);
		return abc;
	}
		
				
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 pune=new Demo2();
		boolean d=pune.m1();
		
		
		System.out.println(d);
		
	
		

	}

}
