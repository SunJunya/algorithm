package com.net;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		
		int count=0;
//		for(int x=k;x<=n;x++){
//			count+=n-x;
//		}
		if(n<15){
			count=Math.abs(((n-k)+(n-15))*k/2);
		}
		else if(n>15){
			count=Math.abs(((n-k)+(n-15))*k/2);
			for(int x=15;x<=n;x++){
				for(int y=k+1;y<=n;y++){
					
					if(x%y>=k){
						count++;
					}

				}
			}
		}
		

		
		System.out.println(count);
	}

}
