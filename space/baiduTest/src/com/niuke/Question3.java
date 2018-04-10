package com.niuke;

import java.awt.geom.Area;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
	@author:sunjunya
	三维空间中有N个点，每个点可能是三种颜色的其中之一，三种颜色分别是红绿蓝，分别用'R', 'G', 'B'表示。 
现在要找出三个点，并组成一个三角形，使得这个三角形的面积最大。
但是三角形必须满足：三个点的颜色要么全部相同，要么全部不同。 
*/
public class Question3 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		Map<int[], String> pots=new HashMap<>();
		for(int i=0;i<n;i++){
			String value=in.next();
			int[] a=new int[3];
			for(int j=0;j<3;j++){
				
				a[i]=in.nextInt();
			}
			pots.put(a, value);
		}
		Collection<String> values=pots.values();
		int max=0;
		int r=0,g=0,b=0;
		for(String string:values){
			if("R".equals(string)){
				r++;
			}else if("G".equals(string)){
				g++;
			}else{
				b++;
			}
		}
		
		if(r==0 || g==0 ||b==0){
			
		}
		
	}

}
