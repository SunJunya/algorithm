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
	��ά�ռ�����N���㣬ÿ���������������ɫ������֮һ��������ɫ�ֱ��Ǻ��������ֱ���'R', 'G', 'B'��ʾ�� 
����Ҫ�ҳ������㣬�����һ�������Σ�ʹ����������ε�������
���������α������㣺���������ɫҪôȫ����ͬ��Ҫôȫ����ͬ�� 
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
