package com.heapSort;

import java.util.Arrays;

public class Heapsort {
	/*
	 * ����������Ļ���˼����ǹ���󶥶�
	 * */
	public static void main(String[] args){
		int[] a={50,10,90,30,70,40,80,60,20};
		heapSort(a);
		System.out.println(Arrays.toString(a));
		int i=3;
		System.out.println(a[i]);
	}

	private static void heapSort(int[] a) {
		int i;
		for(i=a.length/2;i>=0;i--){
			heapAdjust(a,i,a.length-1);
		}
		
		for(i=a.length-1;i>1;i--){
			swap(a,0,i);
			heapAdjust(a, 0, i-1);
		}
	}

	private static void swap(int[] a, int i, int i2) {
		int temp=a[i];
		a[i]=a[i2];
		a[i2]=temp;
	}

	private static void heapAdjust(int[] a, int i, int j) {
		int temp=a[i];
		int n;
		for(n=2*i+1;n<j;n=2*n+1){
			if(a[n]<a[n+1]){
				n++;       //n������¼�ӽڵ��нϴ��λ��
			}
			if(temp>a[n]){
				break;
			}
			a[i]=a[n];
			i=n;
		}
		a[i]=temp;
		
	}

}
