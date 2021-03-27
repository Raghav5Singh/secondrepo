package day7;

import java.util.Scanner;

public class swapping {
	
	public static void main(String[] args) 
	{
		System.out.println("enter numbers");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Value of 1st number"+n1);
        System.out.println("Value of 2nd number"+n2);
        
        n1=n1+n2;
        n2=n1-n2;
        n1=n2-n1;
        System.out.println("after swapping");
        System.out.println("Value of 1st number"+n1);
        System.out.println("Value of 2nd number"+n2);
        
        		
	}
}
