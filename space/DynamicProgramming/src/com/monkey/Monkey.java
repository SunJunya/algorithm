package com.monkey;

class Cube{
	private int a;
	private int b;
	private int c;
	private  int[] s=new int[3];
	private int[] hight=new int[3];
	private boolean flag;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int[] getS() {
		return s;
	}

	public void setS(int[] s) {
		this.s = s;
	}

	public Cube(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setSAndHight(){
		s[0]=a*b;
		s[1]=a*c;
		s[2]=b*c;
		hight[0]=c;
		hight[1]=b;
		hight[2]=a;
	}
	
	public void getMaxS(){
		
	}
	
}

public class Monkey {

	public static void main(String[] args) {
		

	}

}
