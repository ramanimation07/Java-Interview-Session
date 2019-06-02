package com.interviewprog;

import java.io.ObjectInputStream.GetField;

public class Primenumber {

	public static void main(String[] args) {
	
		System.out.println("2 is prime number:" +isPrime(2));
		
		getPrimeNumbers(30);

	}
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num% i==0) {
				return false;
			}
		}
		return true; 	
	}
	
	public static void getPrimeNumbers(int num )
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+ "");
			}
		}
	}
	

}
