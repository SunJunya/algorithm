package com.maxRoad;

public class MaxRoad {
//数字三角形问题
	public static void main(String[] args) {
		int n=5;
		int[][] x={{9},{12,15},{10,6,8},{2,18,9,5},{19,7,10,4,16}};

		for(int i=1;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j==0){
					x[i][j]=x[i][j]+x[i-1][j];
				}else if(j==i){
					x[i][j]=x[i][j]+x[i-1][j-1];
				}else{
					if(x[i-1][j-1]>x[i-1][j]){
						x[i][j]+=x[i-1][j-1];
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<n;i++){
			if(max<x[n-1][i]){
				max=x[n-1][i];
			}
		}
		System.out.println(max);

	}

}
