package com.niuke;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Set<Integer> prices=new TreeSet<>();
		for(int i=0;i<n;i++){
			int m=in.nextInt();
			prices.add(m);
		}
		int i=0;
		if(prices.size()<3){
			System.out.println(-1);
		}else{
			/*for(Integer a:prices){
				if(i==2){
					System.out.println(a);
				}
				i++;
			}*/
			System.out.println(prices.toArray()[2]);
		}
	}

}
