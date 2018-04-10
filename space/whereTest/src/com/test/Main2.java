package com.test;

import java.util.Arrays;
import java.util.Scanner;

/**
	@author:sunjunya
	5 200
100 30 20 110 120
*/
public class Main2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int m=in.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			Arrays.sort(a);
			int sum=0;
			int flag=0;
			int i,j,k;
			int[] b=new int[n];
			for(i=0,k=0;i<n&&k<n;i++){
				
				sum+=a[i];
				b[i]=sum;
				if(sum>m ){
					k++;
					flag=sum-m;
					for(j=0;j<=i;j++){
						if(flag==a[j] || flag==b[j]){
							System.out.println("perfect");
						}
					}
					i=k;
					sum=0;
				}else if(sum==m){
					System.out.println("perfect");
					break;
				}
			}
			if(sum!=m){
				System.out.println("good");
			}
			
			
	}
	
}
