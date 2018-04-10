package com.niuke01;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Answer03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		
		int depth=0,max=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				depth++;
			}else{
				depth--;
			}
			max=Math.max(max, depth);
		}
		
		System.out.println(max);
	}

}
