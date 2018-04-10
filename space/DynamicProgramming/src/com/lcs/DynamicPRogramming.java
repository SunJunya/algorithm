package com.lcs;

import java.util.ArrayList;
import java.util.List;

public class DynamicPRogramming {

	public static void main(String[] args) {
		String[] x={"B","D","C","A","B","A"};
		String[] y={"A","B","C","D","B","D","A","B"};
		List<String> res=dynamic(x,y);
		System.out.println(res);
	}

	private static List<String> dynamic(String[] x, String[] y) {
		int m=x.length;
		int n=y.length;
		int[][] c=new int[m][n];
		int[][] b=new int[m][n];
		for (int a=0;a<m;a++){
			c[a][0]=0;
		}
		for(int p=0;p<n;p++){
			c[0][p]=0;
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				if(x[i]==y[j]) 
				{
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=1;
				}
				else if(c[i-1][j]>=c[i][j-1]){
					c[i][j]=c[i-1][j];
					b[i][j]=2;
				}
				else{
					c[i][j]=c[i][j-1];
					b[i][j]=3;
				}
			}
		}
		
		List<String> list=new ArrayList<>();
		LCS(m,n,b,x,list);
		
		return list;
	}

	private static void LCS(int m,int n,int[][] b,String[] x,List<String> list) {
		if(m==0 || n==0) return ;
		else if(b[m][n]==1){
			LCS(m-1,n-1,b,x,list);
			System.out.println(x[m]);
			list.add(x[m]);
		}
		return ;
	}

	

}
