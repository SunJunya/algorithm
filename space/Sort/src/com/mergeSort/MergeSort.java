package com.mergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 归并排序： 递归
 * 将两个或两个以上有序表合并成一个新的有序表，
 * 即把待排序的序列分为若干个子序列，每个子序列是有序的；
 * 然后再把有序子序列合并为整体有序序列
 * */
public class MergeSort {
	
	public void mergesort(int[] a,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			mergesort(a, low, mid);
			mergesort(a, mid+1, high);
			
			System.out.println("low= "+low);
			System.out.println("high= "+high);
			//递归结束后 合并
			merge(a,low,mid,high);
		}
	}
	
	private void merge(int[] a, int low, int mid, int high) {
		int[] temp=new int[high-low+1];
		int i=low;//左指针
		int j=mid+1;//右指针
		int k=0;
		//把较小的数先移到新数组中
		while(i<mid && j<=high){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		
		//把左边剩余的数移入数组
		while(i<=mid){
			temp[k++]=a[i++];
		}
		
		//把右边剩余的书移入数组
		while(j<=high){
			temp[k++]=a[j++];
		}
		
		//把新数组中的数覆盖nums数组
		for(int k2=0;k2<temp.length;k2++){
			a[k2+low]=temp[k2];
		}
		
	}

	public static void main(String[] args){
		int[] a={51,46,20,18,65,97,82,30,77,50};
		MergeSort m=new MergeSort();
		m.mergesort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
}
