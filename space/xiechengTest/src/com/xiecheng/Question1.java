package com.xiecheng;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int length=in.nextInt();
		int[] a=new int[length];
		StringBuilder sBuilder=new StringBuilder();
		for(int i=0;i<length;i++){
			a[i]=in.nextInt();
			sBuilder.append(String.valueOf(a[i]));
		}

		String s=sBuilder.toString();
		s=s.replaceAll("0", "");
		char[] cs=s.toCharArray();
		
		for(int i=0;i<length;i++){
			if(i<cs.length){
				a[i]=Character.getNumericValue(cs[i]);
			}
			else {
				a[i]=0;
			}
		}
		
		for(int i=0;i<length;i++){
			System.out.println(a[i]);
		}
		
	}

}
