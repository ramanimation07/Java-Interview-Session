package com.interviewprog;

public class RevStrprog {

	public static void main(String[] args) {

		String name="Selenium";
		String str="";
		int len=name.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			str=str+name.charAt(i);
		}
		System.out.println(str);

	}

}
