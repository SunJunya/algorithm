package com.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question4 {

	public static void main(String[] args) {
		int count=0;
		Scanner in=new Scanner(System.in);
		int length=in.nextInt();
		int[] a=new int[length];
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<length;i++){
			int temp=in.nextInt();
			list.add(temp);
		}
		
		
		/*for(int i=length-1;i>=0;i--){
			int flag=list.get(0);
			int index=0;
			for(int j=1;j<list.size();j++){
				if(flag<list.get(j)){
					flag=list.get(j);
					index=j;
				}
			}
			System.out.println(count);
			list.remove(index);
			a[i]=flag;
			
		}*/
		
		for(int i=0;i<length-1;i++){
			if(a[0]>a[i+1]){
				
			}
		}
		System.out.println(count);
	
		
	}

}
