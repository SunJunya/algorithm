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
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public Father() {
		System.out.println("���๹�췽��");
	}
	
}

class Son extends Father{
	
	static{
		System.out.println("���ྲ̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public Son() {
		System.out.println("���๹�췽��");
	}
	
}
