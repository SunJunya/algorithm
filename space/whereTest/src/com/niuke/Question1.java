package com.niuke;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question1 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
			A[i]=in.nextInt();
		}
		int val=in.nextInt();
		int index=Question1.getPos(A, n, val);
		System.out.println(index);
	}
	
	public static int getPos(int[] A, int n, int val) {
		int low=0;
		int high=n-1;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			if(A[mid]==val){
				if(mid>=1 && A[mid-1]==val){
					high=mid-1;
				}	
				else{
					return mid;
				}
			}else if(A[mid]>val){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
    }
}
