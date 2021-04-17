package week1.day1;

import java.util.Scanner;

public class CharOcc {

	public static void main(String[] args) 
	{
		
		Scanner num = new Scanner(System.in);
	    System.out.print("Enter the stringr:");
	    String str = num.next();
	    
	    int c = 0;
	    for (int i=0; i < str.length(); i++)
	    {
	        if (str.charAt(i) == 'a')
	        {
	             c++;
	        }
	    }
		System.out.println("occurrence of an given array: "+c);
	}
	

}
