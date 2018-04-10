package com.binarySearch;

public class BinarySearch {
	/*
	 * 二分查找主要是解决在“一堆数中找出指定的数”
	 * 应用二分查找这一堆数必须有的特征：
	 * 存储在数组中？
	 * 有序排列
	 * */
	public static void main(String[] args){
		int[] a={4,67,34,7,14,17,21,27,31,38,42,46,53,75};
		int key=46;
		int address=binarySearch(a,key);
		System.out.println(address);
		System.out.println(a[address]);
	}

	private static int binarySearch(int[] a, int key) {
		int low=0;
		int high=a.length-1;
		int count=0;
		while(low<=high){
			int mid=(low+high)/2;//二分查找 o(logn)
//			int mid=low+(high-low)*(key-a[low])/(a[high]-a[low]);  // 插值查找  o(logn)
			count++;
			System.out.println("mid ="+ mid);
			if(a[mid]>key){
				high=mid-1;
			}else if(a[mid]==key){
				return mid;
			}else{
				
				low=mid+1;
			}
			System.out.println("count="+count);
		}
		return -1;
	}
}
