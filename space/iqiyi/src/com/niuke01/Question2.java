package com.niuke01;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question2 {

	public static void main(String[] args) {
		/*
		 * ���Ƕ��������������ϵĺ���SSR(ƽ����֮�͵�ƽ��):SSR(A, B) = (sqrt(A) + sqrt(B))^2��ţţ�Ժ���ֵΪ����������ܸ���Ȥ��
		 * ���ڸ�������n��m,�����ţţ���������(A, B)������, ����1 �� A �� n, 1 �� B �� m����SSR(A, B)��һ��������
		 * */
		int count=0;
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		//for(int i=1;i<=n;i++){
			/*
			 * ��Ҫ�ж�2*Math.sqrt(i)*Math.sqrt(j)�Ƿ�Ϊ����
			 * */
			
//			for(int j=1;j<=m;j++){
//				if(i==j){
//					count++;
//				}else if((int) Math.sqrt(i*j)*(int) Math.sqrt(i*j)==i*j){
//					count++;
//				}else{
//					double flag=2*Math.sqrt(i)*Math.sqrt(j);
//					int iflag=(int) (2*Math.sqrt(i)*Math.sqrt(j));				
//					if(flag==iflag  ){
//						count++;
//					}
//				}
//				
//			}
			
			
//			for(int j=1;j<=m;j++){
//				double dij=Math.sqrt(4*i*j);
//				int iij=(int) Math.sqrt(4*i*j);
//				if(dij==iij){
//					count++;
//				}
//			}
//			
			
			

		//}
		
		double sum=n*m;
		int a=(int) Math.sqrt(sum);
		for(int i=1;i<=a;i++){
			double max=i*i;
			
		}
		
		
		System.out.println(count);
		
	}
	
	
}