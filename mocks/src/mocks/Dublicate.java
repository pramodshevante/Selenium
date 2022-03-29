package mocks;



public class Dublicate {

	public static void main(String[] args) {
		// find duplicate character
	 
		char Char;
		int count;
		int dup=0;	
		
		String a ="JAVA";
		a=a.toLowerCase();
		for (Char = 'a';Char <='z'; Char++) {
			count=0;
			
			for (int i=0;i<a.length(); i++) {
				if (a.charAt(i)==Char) {
					count++;
				}
			}
			if (count > 1)
			{
		System.out.println("Number of " +  Char  +" is "  +  count);
			dup++;
		}
//	
//		else if(count==1)
//		{
//			System.out.print(Char);
//		}
//	}
//	System.out.println();
//	System.out.println("total "+ dup);
	
	}
	}}
		