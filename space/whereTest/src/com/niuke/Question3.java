package com.niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/**
	@author:sunjunya
*/
public class Question3 {

	public static void main(String[] args) {
		String[] str={"i am a coder","Coder Coder","Code"};
		String[] restr=findCoder(str, str.length);
		System.out.println(restr.length);
		for(int i=0;i<restr.length;i++){
			System.out.println(restr[i]);
		}
	}
	
	public static String[] findCoder(String[] A, int n) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			String string=A[i];
			char[] cs=string.toCharArray();
			int length=string.length();
			int count=0;
			
			if(length>=5){
				for(int j=0;j<length-4;j++){
					if("Coder".equalsIgnoreCase(String.valueOf(cs, j, 5))){
						j=j+3;
						count++;
					}
				}
			}
			if(count!=0){
				list.add(count);
				
			}else{
				A[i]=null;
			}

		}
		int max=0;
		for(int i=1;i<list.size();i++){
			for(int j=0;j<i;j++){
				if(list.get(i)>list.get(j)){
					String temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
        // write code here
		return A;
    }

}
