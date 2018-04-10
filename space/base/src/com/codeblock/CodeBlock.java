package com.codeblock;
/**
	@author:sunjunya
*/
public class CodeBlock {

	public static void main(String[] args) {
//		new Son();
//		new Son();
//		new Son();
		
		StringBuilder aBuilder=new StringBuilder("hello");
		aBuilder.append("123");
		System.out.println(aBuilder.toString());
	}

}

class Father{

	static{
		System.out.println("父类静态代码块");
	}
	
	{
		System.out.println("父类代码块");
	}
	
	public Father() {
		System.out.println("父类构造方法");
	}
	
}

class Son extends Father{
	
	static{
		System.out.println("子类静态代码块");
	}
	
	{
		System.out.println("子类代码块");
	}
	
	public Son() {
		System.out.println("子类构造方法");
	}
	
}
