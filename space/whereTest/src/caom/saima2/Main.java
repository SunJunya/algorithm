package caom.saima2;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int a=in.nextInt();
			int b=a+1;
			while(MyReserve(b)!=b && b>a){
				b++;
			}
			System.out.println(b);
		}
		in.close();
	}

	private static int MyReserve(int a) {
		StringBuilder b=new StringBuilder(String.valueOf(a));
		String cString=b.reverse().toString();
		return Integer.valueOf(cString);
	}

}
