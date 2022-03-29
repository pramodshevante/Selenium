package mocks;
								// Revers string
public class Demo1 {

//	public void m1(String a) {
		
	//	int abc = a.length()-1;
		
	//	for(int i=abc;i>=0;i--) {
	//		System.out.print(a.charAt(i));
			
//		}
		
//	}
public void m2(String a) {
		
		int abc = a.length()-1;
		
		for(int i=abc;i>=0;i--) {
			System.out.print(a.charAt(i));
		
		}
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 pune= new Demo1();
	pune.m2("JAVA");
		
	//	pune.m1("pramod");
	
		
		
	}

}
