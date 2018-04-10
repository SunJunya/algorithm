package com.binarySearch;

public class BinarySearch {
	/*
	 * ���ֲ�����Ҫ�ǽ���ڡ�һ�������ҳ�ָ��������
	 * Ӧ�ö��ֲ�����һ���������е�������
	 * �洢�������У�
	 * ��������
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
			int mid=(low+high)/2;//���ֲ��� o(logn)
//			int mid=low+(high-low)*(key-a[low])/(a[high]-a[low]);  // ��ֵ����  o(logn)
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
