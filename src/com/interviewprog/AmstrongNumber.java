package com.interviewprog;

public class AmstrongNumber {

	public static void main(String[] args) {
	
		int num=153;
		int temp=num;
		int r,sum=0;
		
	while(num>0)
	{
		r=num%10;
		num=num/10;
		sum=sum+ r*r*r;

	}
	
	if(temp==sum) {
		System.out.println("On");
	}
	else
	{
		System.out.println("Off");
	}
		
	}

}
