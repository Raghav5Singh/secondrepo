package day7;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int half=n/2;
		int deepak=0;
		for(int i=2;i<=half;i++)	
		{
			if(n%i==0)
			{
		      System.out.println("not a prime"+n);
		      deepak=1;
		      break;
			}
		}
		
		if(deepak==0)
		{
			System.out.println("numbr is prime"+n);
		}

	}
}

