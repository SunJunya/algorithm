package com.niuke01;

import java.util.Scanner;
import java.util.Stack;

/**
	@author:sunjunya
*/
public class Question03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		
		int depth1=0;
		int depth2=0;
		
		String[] lens=string.split("\\)");
		depth1=lens[0].length();
		for(int i=1;i<lens.length;i++){
			if(lens[i].length()>depth1){
				depth1=lens[i].length();
			}
		}
		
		String[] lens2=string.split("\\(");
		depth2=lens2[0].length();
		for(int i=1;i<lens2.length;i++){
			if(lens2[i].length()>depth2){
				depth2=lens2[i].length();
			}
		}
		
		System.out.println(Math.max(depth1, depth2));
		
	}

}
