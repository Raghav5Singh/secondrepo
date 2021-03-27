package day7;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num for table");
		int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int a=n*i;
			System.out.println(n+"*"+i+"="+a);
		}
		
	}

}
