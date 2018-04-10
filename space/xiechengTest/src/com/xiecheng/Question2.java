package com.xiecheng;

import java.util.List;
import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=0;		
		String string=in.nextLine();
		String[] strings=string.split(" ");
		n=strings.length;
		String[][]  a= new String[n][n];
		for(int i=0;i<n;i++){
			a[0][i]=strings[i];
		}
		for(int i=1;i<n;i++){
			String string1=in.nextLine();
			String[] strings1=string1.split("\t");
			n=strings1.length;
			for(int j=0;j<n;j++){
				a[i][j]=strings1[j];
			}
		}
		
		
		
		
		int flag=n-1;
		String[][] b=new String[n][n]; 
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				b[i][j]=a[n-1-j][i];
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
	}

}
