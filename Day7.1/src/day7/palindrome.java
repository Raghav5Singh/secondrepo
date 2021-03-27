package day7;
	
import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int p=s.nextInt();
		int sum=0;
		int old_p=p;
			
		while(p>0)
		{	
		      int r=p%10;
		    	  sum=sum*10+r;
		    	  p=p/10;
			}
			
		if(old_p==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome"); 
	}

	}
