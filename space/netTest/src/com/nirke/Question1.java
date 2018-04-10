package com.nirke;


/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		int n=10;
		
		Question1 question1=new Question1();
		String string=question1.restore(n);
		System.out.println(string);
		
	}
	
	public String restore(int n){
		String string="";
		int x=3;
		if(n==1){
			return string+"1";
		}else if(n==2){
			return string+"2";
		}else{
			if(n-(2*x+1)>n-(2*x+2))
			{
				return string+restore(n-2*x-1);
			}
			return string+restore(n);
		}
			
	}

	

}
