package org.helloJava.sample;

public class MyFunc {
	
	public  int calcProduct(int a,int b) {
		
		
		return (a*b);
		
		
	}
	
	public  void calculateFcatorial(int n) {
		int factorial = 1;
		
		if(n < 1)
		{
	      System.out.println("invalid number");
		}
		
		for(int i=n ; i>=1 ; i--)
		{
			factorial = factorial * i;
		}
		
		return;		
	}
	

}