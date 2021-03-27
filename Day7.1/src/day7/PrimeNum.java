package day7;


public class PrimeNum {

	public static void main(String[] args) {
		
		int n=53;
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
			
		
		
						

