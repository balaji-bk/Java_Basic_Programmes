package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int i = 2;
		 
	    Scanner n = new Scanner(System.in);
		System.out.print("Enter the number:");
        int num = n.nextInt();
      
        		if (num % i == 0)
        		{
        			System.out.println(num + " is a prime number.");
        		}
        		else
        		{
        			System.out.println(num + " is not a prime number.");  
        		}
        }
      
   }

	


