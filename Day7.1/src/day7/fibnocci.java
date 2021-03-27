package day7;

import java.util.Scanner;

public class fibnocci {
	
	public static void main(String[] args) {
	
		int a1=0;
		int a2=1;		
		System.out.println(a1);
		System.out.println(a2);
		int sum;
		int i;	
		for(i=1;i<=10;i++)
		{
			sum=a1+a2;
			System.out.println(sum);
			a1=a2;
			a2=sum;
		}		
	}
}
