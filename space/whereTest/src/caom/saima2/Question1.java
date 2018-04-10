package caom.saima2;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Question1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String a= in.next();
			String b=in.next();
			if(a.length()<b.length()){
				String c=b;
				for(int i=0;i<b.length();i++)
				{
					
					int flag=0;
					int l=a.length();
					a=a.replaceAll(String.valueOf(b.charAt(i)), "");
					if(a.length()<l){
						c=c.replaceAll(String.valueOf(b.charAt(i)), "");
					}
				}
				if("".equals(a)&&"".equals(c)){
					
					System.out.println(true);
				}else{
					System.out.println(false);}
			}else{
				String c=a;
				for(int i=0;i<a.length();i++)
				{
					
					int flag=0;
					int l=b.length();
					b=b.replaceAll(String.valueOf(a.charAt(i)), "");
					if(b.length()<l){
						c=c.replaceAll(String.valueOf(a.charAt(i)), "");
					}
				}
				if("".equals(b)&&"".equals(c)){
					System.out.println(true);
				}else{System.out.println(false);}
			}
		}
		in.close();
	}

}
