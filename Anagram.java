package week1.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter first String:");
	     String s1 = sc.next();
	     System.out.print("Enter second String:");
	     String s2 = sc.next();
	     
	     if(s1.length()!=s2.length())
	        System.out.println("Not ANAGRAM");
	     else 
	     {
	         char[] a1 = s1.toLowerCase().toCharArray();
	         char[] a2 = s2.toLowerCase().toCharArray();
	         Arrays.sort(a1);
	         Arrays.sort(a2);
	         Arrays.equals(a1, a2);
	         System.out.println("IS ANAGRAM");
	       }
	}

}
