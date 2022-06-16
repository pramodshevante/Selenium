package concept;

public class Sample2 extends Demo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sample2 obj = new Sample2();
		
		String c=obj.getName();
		System.out.println("old name"+"  "   + c);
		
		obj.setName("pom with hybird framwork");
		
		System.out.println(obj.getName());
	}

}
