package com.nirke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str= in.nextLine();
		List<String> list =mySpilt(str);
		double sum=0;
		for(String s:list){
			sum+=s.length();
		}
		double length=sum/list.size();
		System.out.println(String.format("%.2f", length));
		
	}

	private static List<String> mySpilt(String str) {
		List< String> list=new ArrayList<>();
		str=str+" ";
		char[] cs=str.toCharArray();
		int temp=0;
		for(int i=0;i<cs.length-1;i++){
			if(cs[i]!=cs[i+1] ){
				String string=str.substring(temp, i+1);
				list.add(string);
				temp=i+1;
			}
		}
		return list;
	}

}
