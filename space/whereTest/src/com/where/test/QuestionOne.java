package com.where.test;

import java.util.Stack;

/**
	@author:sunjunya
*/
public class QuestionOne {
/*
 * Description:write a piece of code,to adjust if the expression is correct
 * input:a expression
 * output:true or false
 * */
	
	
	public static void main(String[] args) {
		String string1="[a+b*(5-4)]*{x+b+b*{1+2}}";
		String string2="[a+b*(5-4)]*{x+b+b*(({1+2)}}";
		boolean bstr1=checkString(string1);
		boolean bstr2=checkString(string2);
		System.out.println(bstr1);
		System.out.println(bstr2);
	}

	private static boolean checkString(String string) {
		StringBuffer sBuffer=new StringBuffer(string);
		int length=sBuffer.length();
		Stack<Character> stack =new Stack<Character>();
		for(int i=0;i<length;i++){
			char c=sBuffer.charAt(i);
			if(c == '{' || c=='[' ||c=='('){
				stack.push(c);
			}
			if(c=='}' || c==']' || c==')'){
				stack.pop();
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}

}
