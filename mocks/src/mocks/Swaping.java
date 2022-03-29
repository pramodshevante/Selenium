package mocks;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		
		int x,y,t;
		Scanner sc =new Scanner (System.in);
		System.out.print("enter value of x& y");
		x= sc.nextInt();
		y=sc.nextInt();
		
		System.out.print("before sqapping" + x + "  "  + y);
		t=x;
		x=y;
		y=t;
		System.out.print("   after swapping " + x + "  " + y);
		
		
		

	}
	

}
