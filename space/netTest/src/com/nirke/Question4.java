package com.nirke;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[] length=new int[num];
		String[] res=new String[num];  
		for(int i=0;i<num;i++){
			length[i]=in.nextInt();
			int[] a=new int[length[i]];
			for(int j=0;j<length[i];j++){
				int n=in.nextInt();
				a[j]=n;
			}
			Arrays.sort(a);
			for(int m=0;m<a.length-1;m++){
				if(a[m]*a[m+1]<4){
					int temp=a[m];
					a[m]=a[a.length-1-m];
					a[a.length-1-m]=a[m];
				}else if(a[a.length-2]*1>0){
					StringBuilder stringBuilder=new StringBuilder();
					stringBuilder.reverse();
				}
			}
			
		}
	}

}
