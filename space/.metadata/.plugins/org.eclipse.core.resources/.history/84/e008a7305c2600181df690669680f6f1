package com.findmaxsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxSum {
	//连续子数组最大和
	

	public static void main(String[] args) {
//		findmaxsun();
		
		List a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(1);
		a.add(1);
		a.add(1);
		System.out.println(a.size());
		a.remove(2);
		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
	}

	private static void findmaxsun() {
		int[] a= {1,-2,3,10, -4,7, 2,5 };
		int sum=a[0];
		int max=a[0];
		List list=new ArrayList();
		for(int i=1;i<a.length;i++){
			if(a[i]<sum+a[i]){
				sum=sum+a[i];
				list.add(a[i]);
			}else{
				list.clear();
				list.add(a[i]);
				sum=a[i];
			}
			if(max<sum){
				max=sum;
			}
		}
		System.out.println(max);
		System.out.println(list);
	}

}
