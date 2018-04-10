package com.niuke2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
	@author:sunjunya
*/
public class Question4 {

	public static void main(String[] args) {
		String[] a={"rxqrrai","yma","kuxzg","ntjvxk"};
		String[] keys={"a"};
		System.out.println(containKeyword(a, a.length, keys, keys.length).length);
		
	}
	
	public static int[] containKeyword(String[] A, int n, String[] keys, int m) {
		
		List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
        	for(int j=0;j<m&&i<n;j++){
        		if(A[i].contains(keys[j])){
        			list.add(i);
        			break;
        			
        		}
        	}
        }
        Collections.sort(list);
        int[] a;
        if(list.size()>0){
        	a=new int[list.size()];
            for(int i=0;i<list.size();i++){
            	a[i]=list.get(i);
            }
        }else{
        	a=new int[1];
        	a[0]=-1;
        }
        
		return a;
    }
}
