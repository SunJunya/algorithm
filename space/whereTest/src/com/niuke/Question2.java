package com.niuke;
/**
	@author:sunjunya
*/
public class Question2 {

	public static void main(String[] args) {
		String aString="qywyer23tdd";
		int n=11;
		char c=findFirstRepeat(aString, n);
		System.out.println(c);
	}
	
	public static char findFirstRepeat(String A, int n) {
		char index = 0;
		char[] a=A.toCharArray();
		for(int i=1;i<n;i++){
			for(int j=i-1;j>=0;j--){
				if(a[i]==a[j]){
					index=a[i];
					return index;
				}
			}
		}
		return index;
        // write code here
    }
}
