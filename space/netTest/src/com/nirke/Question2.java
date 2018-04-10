package com.nirke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
	@author:sunjunya
*/
public class Question2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String string=Integer.toString(n);
		char[] strings=string.toCharArray();
		List<Character> list=new ArrayList<>();
		for(char c:strings){
			list.add(c);
		}
		Collections.reverse(list);
		StringBuilder sBuilder=new StringBuilder();
		for(char c:list){
			sBuilder.append(c);
		}
		String str=sBuilder.toString();
		int m=Integer.valueOf(str);
		int res=m+n;
		System.out.println(res);
	}

}
