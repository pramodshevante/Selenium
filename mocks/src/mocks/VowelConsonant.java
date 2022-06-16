package mocks;

import java.io.IOException;

public class VowelConsonant {

	public static void main(String[] args)
	        throws IOException
	    {
	        String str = "GeksForaaa";
	        str = str.toLowerCase();
	        int count = 0;
	        int i;
	        char Char = 0;
        for (Char = 'a';Char <='z'; Char++) {
				count=0;
	        
	        for ( i = 0; i < str.length(); i++) {
	        	
	        if(str.charAt(i)==Char)
	            // check if char[i] is vowel
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	                // count increments if there is vowel in
	                // char[i]
	                count++;
	            }
	        }
	 
	  
			// display total count of vowels in string
	        System.out.println("given string containts"+" "  + Char +" at the index"+ count);
	    }
	}}