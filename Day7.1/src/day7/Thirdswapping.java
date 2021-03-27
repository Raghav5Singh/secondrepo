package day7;

import java.util.Scanner;

public class Thirdswapping {
	public static void main(String[] args) 
	{
		System.out.println("enter numbers");
		int n3;
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Value of 1st number"+n1);
        System.out.println("Value of 2nd number"+n2);
        
        n3=n1;
        n1=n2;
        n2=n3;
        System.out.println("after swapping");
        System.out.println("Value of 1st number"+n1);
        System.out.println("Value of 2nd number"+n2);
        
        		
	}


}
