package day7;

import java.util.Scanner;

public class nestedifelse {
	
	public static void main(String[] args) 
	{
		System.out.println("enter value of marks");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=0)
        {
        	if(a%2==0)
        	{
        		System.out.println("even number");
        	}
        	else
        	{
        		System.out.println("Odd number");
        	}	
        }
        else
        {
        	System.out.println("please enter +ve number");
        }
       
	} 
}
