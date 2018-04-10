package com.saima;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(in.hasNextLine()){
			String intstr=in.nextLine();
			char[] a=intstr.toCharArray();
			int n=a.length;
			int res=0;
			for(int i=0;i<n;i++){
				res+=(a[i]-'a')*Math.pow(26, n-1-i);
			}
			System.out.println(res);
		}
		in.close();
		
		
	}

}
