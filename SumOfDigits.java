package week1.day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int m, n, sum = 0;
		
		 Scanner num1 = new Scanner(System.in);
	     System.out.print("1.while loop \n 2.for loop \nEnter your choice:");
	     int ch = num1.nextInt();
	        
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = num.nextInt();
       
        if(ch == 1)
        {
        		while(n > 0)
        		{
        				int n1 = n % 10;
        				sum = sum + n1;
        				n = n / 10;
        		}
        		System.out.println("Sum of Digits for given number:"+sum);
        }
        else
        {
        	for(sum=0 ;n!=0 ;n/=10)
        	{
        	sum+=n%10;
        	}
        	System.out.println("Sum of digits :"+sum);
        	}
        }
    }



