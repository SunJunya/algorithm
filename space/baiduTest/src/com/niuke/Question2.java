package com.niuke;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			int flag=in.nextInt();
			a[i]=flag;
		}
		int sum=0;
		for(int i=0;i<n-1;i++){	
			for(int j=1;j<n-2;j++){
				sum=Math.abs(a[j]-a[i]);
				if(Math.abs(a[j]-a[i])>Math.abs(a[j+1]-a[i])){
					
				}
				else{
					
				}
			}
		}
	}

}
