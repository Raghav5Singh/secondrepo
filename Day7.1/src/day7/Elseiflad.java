package day7;

import java.util.Scanner;

public class Elseiflad {
	

	public static void main(String[] args) 
	{
		System.out.println("enter value of marks");
        Scanner s=new Scanner(System.in);
        int marks=s.nextInt();
        if((marks>=0)&&(marks<35))
        {
        	System.out.println("Fail");
        }
        else if((marks>=35)&&(marks<60))
        {
        	System.out.println("Pass");
        }
        else if((marks>=60)&&(marks<80))
        {
        	System.out.println("1 devision");
        }
        else if((marks>=80)&&(marks<=100))
        {
        	System.out.println("Merit");
        }
        else
             {
        	System.out.println("please enter correct marks");
        }
        
	}
}
