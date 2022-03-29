package mocks;

import java.util.Arrays;

public class Maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
	//	int temp,size;
		
		int[] array = {20,50,22,23,24,25};
		int size= array.length;
//		
//		for(int i=0;i<size;i++) {
//			for(int j= i+1;j<size;j++) {
//				if(array[i]>array[j]) {
//					temp =array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//				}
//			}
//		}
//		System.out.println("third largest no is"+array[size-3]);
//
//	}
//
//}
		//===============================================================================
	//	Arrays.sort(array);
	//	System.out.println("sorter array"+ Arrays.toString(array));
		int max = array[size-2];
		System.out.println("3rd largest"+max);
	}}
