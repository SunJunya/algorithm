package com.niuke2;

import java.util.Stack;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		String string="[a+b*(5-4)]*{x+b+b*(1+2)}";
		System.out.println(chkLegal(string));
	}
	
	public static  boolean chkLegal(String A) {
		char[] cs=A.toCharArray();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<cs.length;i++){
			if(cs[i]=='{'  || cs[i]=='['  ||cs[i]=='('){
				stack.push(cs[i]);
			}
			if(cs[i]=='}' || cs[i]==')' || cs[i]==']'){
				stack.pop();
			}
		}
		if(stack.isEmpty()) return true;
		return false;
    }

}
