package com.fibonacciSearch;
/**
	@file_name:Test.java
	@author:sunjunya
	@time:下午6:22:13
*/
public class Test {

	public static void main(String[] args) {
		int[] a={0,1,16,24,35,47,59,62,73,88,99};
		int key=59;
		int n=a.length-1;
		int index=fibonacciSearch(a,n,key);
		System.out.println(a[index]);
	}

	private static int fibonacciSearch(int[] a, int i, int key) {
		int low=0;
		int high=i;
		int k=0;
		while(i>fibonacci(k)-1){
			k++;  //计算n位于斐波那契数列的位置
		}
		for(int j=i;i<fibonacci(k)-1;j++){
			a[j]=a[i];
		}
		
		return 0;
	}

	private static int fibonacci(int k) {
		if(k==1){
			return 1;
		}
		else if(k==0){
			return 0;
		}
		else{
			return fibonacci(k-1)+fibonacci(k-2);
		}
	}

}
