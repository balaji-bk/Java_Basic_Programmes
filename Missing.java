package week1.day1;

import java.util.Scanner;

public class Missing {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of an array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n-1];
		
		for (int i = 0; i < n-1; i++)
		{
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		int s=n*(n+1)/2; 
		System.out.println("missing element is :"+(s-sum));
		}
	}


