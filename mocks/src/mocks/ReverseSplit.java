package mocks;

public class ReverseSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hi i am pramod";
		
		String[] strarr=str.split(" ");
		
		int len=strarr.length;
		for(int i=len-1;i>=0;i--){
			System.out.print(strarr[i]+" ");
		}
		

	}

}
